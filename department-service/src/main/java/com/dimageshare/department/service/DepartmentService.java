package com.dimageshare.department.service;

import com.dimageshare.core.autogen.grpc.department.Department;
import com.dimageshare.core.autogen.grpc.department.DepartmentIdRequest;
import com.dimageshare.core.autogen.grpc.department.DepartmentResponses;
import com.dimageshare.core.autogen.grpc.department.DepartmentSaving;
import com.dimageshare.department.entity.DepartmentEntity;
import com.dimageshare.department.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentService {
    private DepartmentRepository departmentRepository;
    private static final Logger logger = LoggerFactory.getLogger(DepartmentService.class);

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department findById(DepartmentIdRequest request) {
        int id = request.getDpId();
        logger.info("DepartmentEntity Id: " + id);
        DepartmentEntity entity = departmentRepository.findById(id);
        return entity.initDepartment(entity);
    }

    public DepartmentResponses findAllDepartments() {
        List<DepartmentEntity> entities = departmentRepository.findAll();
        System.out.println(entities);
        if (entities.isEmpty())
            return DepartmentResponses.getDefaultInstance();

        List<Department> departments = entities.stream().map(entity -> entity.initDepartment(entity)).collect(Collectors.toList());

        return DepartmentResponses.newBuilder().addAllDepartment(departments).build();
    }

    public void saveDepartment(DepartmentSaving department) {
        DepartmentEntity entity = new DepartmentEntity(department);
        try {
            departmentRepository.save(entity);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void removeById(DepartmentIdRequest request) {
        int id = request.getDpId();
        logger.info("Department Id: " + id);
        departmentRepository.removeById(id);
    }

}
