package com.dimageshare.user.service;

import com.dimageshare.configuration.interceptor.GrpcClient;
import com.dimageshare.protobuf.core.autogen.grpc.user.UserServiceGrpc;
import com.dimageshare.user.repository.UserRepository;
import com.google.common.annotations.VisibleForTesting;
import io.grpc.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @GrpcClient(value = "user")
    private Channel userChannel;

    private UserRepository userRepository;
    private UserServiceGrpc.UserServiceBlockingStub stub;

    @VisibleForTesting
    protected UserService(Channel userChannel) {
        this.userChannel = userChannel;
    }

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    private final UserServiceGrpc.UserServiceBlockingStub getStub() {
        return UserServiceGrpc.newBlockingStub(userChannel);
    }


}
