package com.dimageshare.department.repository;

import com.dimageshare.department.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findById(int id);

    List<UserEntity> findAllByDepartmentId(int departmentId);

    UserEntity save(UserEntity userEntity);

    void removeById(int userId);

    @Query(value = "SELECT * FROM user", nativeQuery = true)
    List<UserEntity> findAll();
}
