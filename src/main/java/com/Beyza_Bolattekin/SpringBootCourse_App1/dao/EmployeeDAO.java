package com.Beyza_Bolattekin.SpringBootCourse_App1.dao;

import java.util.List;

import com.Beyza_Bolattekin.SpringBootCourse_App1.entity.Employee;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int id);

}
