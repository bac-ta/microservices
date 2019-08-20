package com.dimageshare.department.repository;

import com.dimageshare.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    Department findById(int id);

    Department save(Department department);

    void removeById(int departmentId);

    @Query(value = "SELECT * FROM department", nativeQuery = true)
    List<Department> findAll();
}
