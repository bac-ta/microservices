package com.dimageshare.department.repository;

import com.dimageshare.department.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer> {
    DepartmentEntity findById(int id);

    DepartmentEntity save(DepartmentEntity departmentEntity);

    void removeById(int departmentId);

    @Query(value = "SELECT * FROM department", nativeQuery = true)
    List<DepartmentEntity> findAll();
}
