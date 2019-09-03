package com.dimageshare.master.service.user;

import com.dimageshare.configuration.interceptor.GrpcClient;
import com.dimageshare.master.model.response.UserResponse;
import com.dimageshare.protobuf.core.autogen.grpc.user.User;
import com.dimageshare.protobuf.core.autogen.grpc.user.UserIdRequest;
import com.dimageshare.protobuf.core.autogen.grpc.user.UserServiceGrpc;
import com.google.common.annotations.VisibleForTesting;
import io.grpc.Channel;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @GrpcClient("user")
    private Channel channel;
    private UserServiceGrpc.UserServiceBlockingStub stub;

    @VisibleForTesting
    protected UserService(final Channel channel) {
        this.channel = channel;
    }

    public UserService() {
        super();
    }

    public UserServiceGrpc.UserServiceBlockingStub getStub() {
        return UserServiceGrpc.newBlockingStub(channel);
    }

    public UserResponse findById(int id) {
        UserIdRequest request = UserIdRequest.newBuilder().setId(id).build();
        stub = getStub();
        User user = stub.findUserById(request);
        String name = user.getName();
        String gender= user.getGender().name();
        String email = user.getEmail();
        return null;
    }

}
