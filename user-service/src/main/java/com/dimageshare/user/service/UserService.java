package com.dimageshare.user.service;

import com.dimageshare.configuration.interceptor.GrpcClient;
import com.dimageshare.protobuf.core.autogen.grpc.user.DepartmentIdRequest;
import com.dimageshare.protobuf.core.autogen.grpc.user.User;
import com.dimageshare.protobuf.core.autogen.grpc.user.UserIdRequest;
import com.dimageshare.user.entity.UserEntity;
import com.dimageshare.user.repository.UserRepository;
import io.grpc.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
        int userId = request.getId();
        UserEntity entity = userRepository.findById(userId);
        return entity.initUser();
    }

    public List<User> findByDepartmentId(DepartmentIdRequest request) {
        int departmentId = request.getDepartmentId();
        List<UserEntity> entities = userRepository.findAllByDepartmentId(departmentId);
        return entities.stream().map(UserEntity::initUser).collect(Collectors.toList());
    }

    public List<User> findUsers() {
        List<UserEntity> entities = userRepository.findAll();
        return entities.stream().map(UserEntity::initUser).collect(Collectors.toList());
    }

    public void saveUser(User user) {
        UserEntity entity = new UserEntity(user);
        userRepository.save(entity);
    }

    public void removeUserById(UserIdRequest request) {
        int id = request.getId();
        userRepository.removeById(id);
    }

}
