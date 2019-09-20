package com.dimageshare.user.rpc;

import com.dimageshare.protobuf.core.autogen.rpc.user.DepartmentIdRequest;
import com.dimageshare.protobuf.core.autogen.rpc.user.User;
import com.dimageshare.protobuf.core.autogen.rpc.user.UserIdRequest;
import com.dimageshare.protobuf.core.autogen.rpc.user.UserResponses;
import com.dimageshare.protobuf.core.autogen.rpc.user.UserSaving;
import com.dimageshare.protobuf.core.autogen.rpc.user.UserServiceGrpc;
import com.dimageshare.user.service.UserService;
import com.google.protobuf.Empty;
import demo.spring.boot.grpc.server.GrpcService;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService(value = UserServiceGrpc.class)
public class UserGrpcServer extends UserServiceGrpc.UserServiceImplBase {

    private UserService service;

    @Autowired
    public UserGrpcServer(final UserService service) {
        this.service = service;
    }

    @Override
    public void findUserById(UserIdRequest request, StreamObserver<User> responseObserver) {
        responseObserver.onNext(service.findById(request));
        responseObserver.onCompleted();
    }

    @Override
    public void findUserByDepartmentId(DepartmentIdRequest request, StreamObserver<UserResponses> responseObserver) {
        UserResponses responses = service.findByDepartmentId(request);
        responseObserver.onNext(responses);
        responseObserver.onCompleted();
    }

    @Override
    public void findUsers(Empty request, StreamObserver<UserResponses> responseObserver) {
        UserResponses responses = service.findUsers();
        responseObserver.onNext(responses);
        responseObserver.onCompleted();
    }

    @Override
    public void removeUserById(UserIdRequest request, StreamObserver<Empty> responseObserver) {
        service.removeUserById(request);
        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }

    @Override
    public void saveUser(UserSaving request, StreamObserver<Empty> responseObserver) {
        service.saveUser(request);
        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }
}