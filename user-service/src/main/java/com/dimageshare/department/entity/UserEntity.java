package com.dimageshare.department.entity;

import com.dimageshare.core.autogen.grpc.user.Gender;
import com.dimageshare.core.autogen.grpc.user.User;
import com.dimageshare.core.autogen.grpc.user.UserSaving;
import com.dimageshare.department.enumeration.GenderEnum;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
    @Column(name = "gender", length = 15)
    @Enumerated(EnumType.STRING)
    private GenderEnum genderEnum;
    @Column
    private String email;
    @Column
    private Integer age;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "department_id")
    private Integer departmentId;

    public UserEntity() {
        super();
    }

    /**
     * Map UserEntity to User
     */
    public User initUser(UserEntity entity) {
        Gender gender = Gender.forNumber(entity.getGenderEnum().getCode());
        return User.newBuilder()
                .setId(entity.getId())
                .setName(entity.getName())
                .setGender(gender)
                .setEmail(entity.getEmail())
                .setAge(entity.getAge())
                .setPhoneNumber(entity.getPhoneNumber())
                .setDepartmentId(entity.getDepartmentId())
                .build();
    }

    public UserEntity(UserSaving user) {
        this.name = user.getName();
        Gender gender = user.getGender();
        this.genderEnum = GenderEnum.findByCode(gender.getNumber());
        this.email = user.getEmail();
        this.age = user.getAge();
        this.phoneNumber = user.getPhoneNumber();
        this.departmentId = user.getDepartmentId();
    }
}
