package com.Beyza_Bolattekin.SpringBootCourse_App1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Beyza_Bolattekin.SpringBootCourse_App1.common.Coach;
import com.Beyza_Bolattekin.SpringBootCourse_App1.common.SwimCoach;

@Configuration
public class SportsConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
