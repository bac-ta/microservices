package com.dimageshare.department.service;

import com.dimageshare.core.autogen.grpc.user.DepartmentIdRequest;
import com.dimageshare.core.autogen.grpc.user.User;
import com.dimageshare.core.autogen.grpc.user.UserIdRequest;
import com.dimageshare.core.autogen.grpc.user.UserResponses;
import com.dimageshare.core.autogen.grpc.user.UserSaving;
import com.dimageshare.department.entity.UserEntity;
import com.dimageshare.department.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(UserIdRequest request) {
        int userId = request.getId();
        logger.info("User Id: " + userId);
        UserEntity entity = userRepository.findById(userId);

        return entity.initUser(entity);
    }

    public UserResponses findByDepartmentId(DepartmentIdRequest request) {
        int departmentId = request.getDepartmentId();
        logger.info("Department Id: " + departmentId);
        List<UserEntity> entities = userRepository.findAllByDepartmentId(departmentId);
        List<User> users = entities.stream().map(entity -> entity.initUser(entity)).collect(Collectors.toList());

        return UserResponses.newBuilder().addAllUser(users).build();
    }

    public UserResponses findUsers() {
        List<UserEntity> entities = userRepository.findAll();
        List<User> users = entities.stream().map(entity -> entity.initUser(entity)).collect(Collectors.toList());

        return UserResponses.newBuilder().addAllUser(users).build();
    }

    public void saveUser(UserSaving user) {
        UserEntity entity = new UserEntity(user);
        try {
            userRepository.save(entity);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void removeUserById(UserIdRequest request) {
        int id = request.getId();
        logger.info("User Id: " + id);
        userRepository.removeById(id);
    }

}

