package com.Beyza_Bolattekin.SpringBootCourse_App1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootCourseApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCourseApp1Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {
		return runner -> {
			System.out.println("CommandLineRunner test 1");
		};
	}

}
