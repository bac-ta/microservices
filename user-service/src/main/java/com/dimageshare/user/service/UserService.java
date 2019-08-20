package com.dimageshare.user.service;

import com.dimageshare.configuration.interceptor.GrpcClient;
import com.dimageshare.protobuf.core.autogen.grpc.user.User;
import com.dimageshare.protobuf.core.autogen.grpc.user.UserIdRequest;
import com.dimageshare.user.entity.UserEntity;
import com.dimageshare.user.repository.UserRepository;
import io.grpc.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @GrpcClient(value = "user")
    private Channel userChannel;
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(UserIdRequest request) {
        int id = request.getId();
        UserEntity entity = userRepository.findById(id);
        return entity.initUser(entity);
    }

}
