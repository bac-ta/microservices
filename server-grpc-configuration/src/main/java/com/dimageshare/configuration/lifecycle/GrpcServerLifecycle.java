package com.dimageshare.configuration.lifecycle;

import com.dimageshare.configuration.factory.GrpcServerFactory;
import io.grpc.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.SmartLifecycle;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class GrpcServerLifecycle implements SmartLifecycle {

    private static final Logger logger = LoggerFactory.getLogger(GrpcServerLifecycle.class);

    private static AtomicInteger serverCounter = new AtomicInteger(-1);

    private volatile Server server;
    private volatile int phase = Integer.MAX_VALUE;
    private final GrpcServerFactory service;

    public GrpcServerLifecycle(GrpcServerFactory service) {
        this.service = service;
        logger.info("constructor");
    }

    @Override
    public void start() {
        try {
            startGrpcServer();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public void stop() {
        stopGrpcServer();
    }

    @Override
    public boolean isRunning() {
        return this.server != null && !this.server.isShutdown();
    }

    @Override
    public int getPhase() {
        return this.phase;
    }

    @Override
    public boolean isAutoStartup() {
        return true;
    }

    @Override
    public void stop(Runnable callback) {
        this.stop();
        callback.run();
    }

    protected void startGrpcServer() throws IOException {
        Server localServer = this.server;
        if (localServer == null) {
            this.server = service.createServer();
            this.server.start();

            logger.info("gRPC Server started, listening on address: {}, port: {}", service.getAddress(), service.getPort());

            Thread awaitThread = new Thread(
                    "container-" + (serverCounter.incrementAndGet())) {

                @Override
                public void run() {
                    try {
                        GrpcServerLifecycle.this.server.awaitTermination();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            };
            awaitThread.setDaemon(false);
            awaitThread.start();
        }
    }

    protected void stopGrpcServer() {
        Server localServer = this.server;
        if (localServer != null) {
            localServer.shutdown();
            this.server = null;
            logger.info("gRPC server stopped");
        }
    }
}
