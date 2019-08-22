package com.dimageshare.department.service;

import com.dimageshare.department.entity.DepartmentEntity;
import com.dimageshare.department.repository.DepartmentRepository;
import com.dimageshare.protobuf.core.autogen.grpc.department.Department;
import com.dimageshare.protobuf.core.autogen.grpc.user.DepartmentIdRequest;
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
        int id = request.getDepartmentId();
        logger.info("DepartmentEntity Id: " + id);
        DepartmentEntity entity = departmentRepository.findById(id);
        return entity.initDepartment(entity);
    }

    public List<Department> findAllDepartments() {
        List<DepartmentEntity> entities = departmentRepository.findAll();
        return entities.stream().map(entity -> {
            return entity.initDepartment(entity);
        }).collect(Collectors.toList());
    }

    public boolean saveDepartment(Department department) {
        DepartmentEntity entity = new DepartmentEntity(department);
        DepartmentEntity entitySave = departmentRepository.save(entity);
        if (entitySave == null)
            return false;
        return true;
    }

    public void removeById(DepartmentIdRequest request) {
        int id = request.getDepartmentId();
        logger.info("Department Id: " + id);
        departmentRepository.removeById(id);
    }
}
