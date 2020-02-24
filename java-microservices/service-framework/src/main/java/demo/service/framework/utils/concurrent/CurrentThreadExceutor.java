package demo.service.framework.utils.concurrent;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class CurrentThreadExceutor implements ExecutorService {

    @Override
    public void execute(@Nullable Runnable command) {
        command.run();
    }

    @Override
    public void shutdown() {
    }

    @Override
    public List<Runnable> shutdownNow() {
        return Collections.emptyList();
    }

    @Override
    public boolean isShutdown() {
        return false;
    }

    @Override
    public boolean isTerminated() {
        return false;
    }

    @Override
    public boolean awaitTermination(long timeout, @Nullable TimeUnit unit) {
        return false;
    }

    @Override
    public <T> Future<T> submit(@Nullable Callable<T> task) {
        FutureTask<T> f = new FutureTask<T>(task);
        f.run();
        return f;
    }

    @Override
    public <T> Future<T> submit(@Nullable Runnable task, T result) {
        FutureTask<T> f = new FutureTask<T>(task, result);
        f.run();
        return f;
    }

    @Override
    public Future<?> submit(@Nullable Runnable task) {
        FutureTask<?> f = new FutureTask<Void>(task, null);
        f.run();
        return f;
    }

    @Override
    public <T> List<Future<T>> invokeAll(@Nullable Collection<? extends Callable<T>> tasks) {
        return tasks.stream().map(this::submit).collect(Collectors.toList());
    }

    @Override
    public <T> List<Future<T>> invokeAll(@Nullable Collection<? extends Callable<T>> tasks, long timeout, @Nullable TimeUnit unit) {
        return tasks.stream().map(this::submit).collect(Collectors.toList());
    }

    @Override
    public <T> T invokeAny(@Nullable Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
        return tasks.stream().map(this::submit).findFirst().get().get();
    }

    @Override
    public <T> T invokeAny(@Nullable Collection<? extends Callable<T>> tasks, long timeout, @Nullable TimeUnit unit) throws InterruptedException, ExecutionException {
        return tasks.stream().map(this::submit).findFirst().get().get();
    }
}
