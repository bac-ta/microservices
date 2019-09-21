package com.dimageshare.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.dimageshare.department", "com.dimageshare.department.service"})
public class DepartmentServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}
}
