package com.dimageshare.user.service;

import com.dimageshare.protobuf.core.autogen.grpc.user.DepartmentIdRequest;
import com.dimageshare.protobuf.core.autogen.grpc.user.User;
import com.dimageshare.protobuf.core.autogen.grpc.user.UserIdRequest;
import com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses;
import com.dimageshare.user.entity.UserEntity;
import com.dimageshare.user.message.ErrorMessage;
import com.dimageshare.user.repository.UserRepository;
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

    public void saveUser(User user) throws Exception {
        UserEntity entity = new UserEntity(user);
        UserEntity entitySave = userRepository.save(entity);
        if (entitySave == null)
            throw new Exception(ErrorMessage.SAVE_USER_ERROR);

    }

    public void removeUserById(UserIdRequest request) {
        int id = request.getId();
        logger.info("User Id: " + id);
        userRepository.removeById(id);
    }

}
