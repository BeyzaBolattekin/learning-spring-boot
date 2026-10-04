package com.Beyza_Bolattekin.SpringBootCourse_App1;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.Beyza_Bolattekin.SpringBootCourse_App1.dao.StudentDAO;
import com.Beyza_Bolattekin.SpringBootCourse_App1.entity.Student;

@SpringBootApplication
public class SpringBootCourseApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCourseApp1Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			updateStudent(studentDAO);
		};
	}

	private void updateStudent(StudentDAO studentDAO) {

		int studentId = 2;
		Student currentStudent = studentDAO.findById(studentId);

		currentStudent.setFirstName("Scooby");
		currentStudent.setLastName("Doo");
		currentStudent.setEmail("scooby@doo.com");

		studentDAO.update(currentStudent);

		System.out.println(currentStudent);

	}

	private void queryForStudentsByLastname(StudentDAO studentDAO) {

		List<Student> allStudentsByLastname = studentDAO.findByLastname("Doe");

		for (Student tempStudent : allStudentsByLastname) {
			System.out.println(tempStudent);
		}
	}

	private void queryAllStudents(StudentDAO studentDAO) {

		List<Student> allStudents = studentDAO.findAll();

		for (Student tempStudent : allStudents) {
			System.out.println(tempStudent);
		}

	}

	private void readStudent(StudentDAO studentDAO) {
		int theId = 3;
		System.out.println("fetching student with the id " + theId);
		Student myStudent = studentDAO.findById(theId);
		System.out.println("found the student: " + myStudent);

	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		System.out.println("crating new 3 student object");
		Student tempStudent1 = new Student("John", "Doe", "John@doe.com");
		Student tempStudent2 = new Student("Mary", "Doe", "Mary@doe.com");
		Student tempStudent3 = new Student("Bonita", "Doe", "Bonita@doe.com");

		System.out.println("save the student objects");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("crating new student object");
		Student tempStudent = new Student("Paul", "Doe", "paul@doe.com");

		System.out.println("save the student object");
		studentDAO.save(tempStudent);

		System.out.println("student saved, generated id=" + tempStudent.getId());
	}

}
