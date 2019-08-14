package com.dimageshare.user.entity;

import com.dimageshare.user.enumeration.Gender;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {
                        "email"
                })
        }
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Gender gender;
    private String email;
    private Integer age;
    @Column(name = "phone_number")
    private String phoneNumber;
    private Integer departmentId;
}
