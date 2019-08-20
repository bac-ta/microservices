package com.dimageshare.user.repository;

import com.dimageshare.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findById(int id);

    List<User> findAllByDepartmentId(int departmentId);

    User save(User user);

    void removeById(int userId);

    @Query(value = "SELECT * FROM user", nativeQuery = true)
    List<User> findAll();
}
