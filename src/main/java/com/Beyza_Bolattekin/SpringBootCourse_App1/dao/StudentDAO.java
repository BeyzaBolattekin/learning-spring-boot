package com.Beyza_Bolattekin.SpringBootCourse_App1.dao;

import java.util.List;

import com.Beyza_Bolattekin.SpringBootCourse_App1.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastname(String theLastName);

    void update(Student theStudent);

}
