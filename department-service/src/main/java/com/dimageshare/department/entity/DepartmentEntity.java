package com.dimageshare.department.entity;

import com.dimageshare.protobuf.core.autogen.grpc.department.Department;
import com.dimageshare.protobuf.core.autogen.grpc.department.DepartmentSaving;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "department")
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;

    public Department initDepartment(DepartmentEntity entity) {
        return Department.newBuilder().
                setId(entity.getId()).
                setName(entity.getName()).
                setDescription(entity.getDescription()).
                build();

    }

    public DepartmentEntity(DepartmentSaving department) {
        this.name = department.getName();
        this.description = department.getDescription();
    }
}
