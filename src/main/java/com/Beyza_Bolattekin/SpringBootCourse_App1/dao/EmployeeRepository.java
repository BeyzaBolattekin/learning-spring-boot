package com.Beyza_Bolattekin.SpringBootCourse_App1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Beyza_Bolattekin.SpringBootCourse_App1.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
