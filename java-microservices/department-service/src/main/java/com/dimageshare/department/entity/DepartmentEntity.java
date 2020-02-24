package com.dimageshare.department.entity;

import com.dimageshare.core.autogen.grpc.department.Department;
import com.dimageshare.core.autogen.grpc.department.DepartmentSaving;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "department")
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private String description;

    public DepartmentEntity() {
        super();
    }

    public Department initDepartment(DepartmentEntity entity) {
        return Department.newBuilder().
                setDpId(entity.getId()).
                setDpName(entity.getName()).
                setDpDescription(entity.getDescription()).
                build();

    }

    public DepartmentEntity(DepartmentSaving department) {
        this.name = department.getDpName();
        this.description = department.getDpDescription();
    }
}
