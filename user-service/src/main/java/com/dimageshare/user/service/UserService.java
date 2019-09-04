package com.dimageshare.user.service;

import com.dimageshare.protobuf.core.autogen.grpc.user.DepartmentIdRequest;
import com.dimageshare.protobuf.core.autogen.grpc.user.User;
import com.dimageshare.protobuf.core.autogen.grpc.user.UserIdRequest;
import com.dimageshare.user.entity.UserEntity;
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

    public List<User> findByDepartmentId(DepartmentIdRequest request) {
        int departmentId = request.getDepartmentId();
        logger.info("Department Id: " + departmentId);
        List<UserEntity> entities = userRepository.findAllByDepartmentId(departmentId);
        return entities.stream().map(entity -> {
            return entity.initUser(entity);
        }).collect(Collectors.toList());
    }

    public List<User> findUsers() {
        List<UserEntity> entities = userRepository.findAll();
        return entities.stream().map(entity -> {
            return entity.initUser(entity);
        }).collect(Collectors.toList());
    }

    public boolean saveUser(User user) {
        UserEntity entity = new UserEntity(user);
        UserEntity entitySave = userRepository.save(entity);
        if (entitySave == null)
            return false;
        return true;
    }

    public void removeUserById(UserIdRequest request) {
        int id = request.getId();
        logger.info("User Id: " + id);
        userRepository.removeById(id);
    }

}
