package com.dimageshare.user.entity;

import com.dimageshare.protobuf.core.autogen.grpc.user.Gender;
import com.dimageshare.protobuf.core.autogen.grpc.user.User;
import com.dimageshare.user.enumeration.GenderEnum;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Data
@Table(name = "user",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {
                        "email"
                })
        }
)
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String name;
    @Column(name = "gender")
    private GenderEnum genderEnum;
    @Column
    private String email;
    @Column
    private Integer age;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "department_id")
    private Integer departmentId;

    /**
     * Contructor
     */

    public UserEntity() {
        super();
    }

    public UserEntity(Integer id, String name, GenderEnum genderEnum, String email, Integer age, String phoneNumber, Integer departmentId) {
        this.id = id;
        this.name = name;
        this.genderEnum = genderEnum;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.departmentId = departmentId;
    }

    /**
     * Map UserEntity to User
     */
    public User initUser() {
        Gender gender = Gender.forNumber(genderEnum.getCode());
        return User.newBuilder()
                .setId(id)
                .setName(name)
                .setGender(gender)
                .setEmail(email)
                .setAge(age)
                .setPhoneNumber(phoneNumber)
                .setDepartmentId(departmentId)
                .build();
    }

    public UserEntity(User user) {
        this.id = user.getId();
        this.name = user.getName();
        Gender gender = user.getGender();
        this.genderEnum = GenderEnum.findByCode(gender.getNumber());
        this.email = user.getEmail();
        this.age = user.getAge();
        this.phoneNumber = user.getPhoneNumber();
        this.departmentId = user.getDepartmentId();
    }
}
