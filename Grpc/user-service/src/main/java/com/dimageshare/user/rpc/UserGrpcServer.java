package com.dimageshare.user.rpc;

import com.dimageshare.core.autogen.grpc.user.GetSumRequest;
import com.dimageshare.core.autogen.grpc.user.GetSumResponse;
import com.dimageshare.core.autogen.grpc.user.UserGrpc;
import com.dimageshare.user.service.CalculateService;
import demo.spring.boot.grpc.server.GrpcService;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService(value = UserGrpc.class)
public class UserGrpcServer extends UserGrpc.UserImplBase {

    @Autowired
    private CalculateService calculateService;

    public UserGrpcServer(final CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @Override
    public void getSum(GetSumRequest request, StreamObserver<GetSumResponse> responseObserver) {
        responseObserver.onNext(calculateService.getSum(request));
        responseObserver.onCompleted();
    }
}
