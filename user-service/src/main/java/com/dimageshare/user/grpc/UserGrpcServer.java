package com.dimageshare.user.grpc;

import com.dimageshare.configuration.factory.GrpcServerService;
import com.dimageshare.protobuf.core.autogen.grpc.user.DepartmentIdRequest;
import com.dimageshare.protobuf.core.autogen.grpc.user.User;
import com.dimageshare.protobuf.core.autogen.grpc.user.UserIdRequest;
import com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses;
import com.dimageshare.protobuf.core.autogen.grpc.user.UserSaving;
import com.dimageshare.protobuf.core.autogen.grpc.user.UserServiceGrpc;
import com.dimageshare.user.service.UserService;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcServerService(value = UserGrpcServer.class)
public class UserGrpcServer extends UserServiceGrpc.UserServiceImplBase {

    private UserService service;

    @Autowired
    public UserGrpcServer(UserService service) {
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
