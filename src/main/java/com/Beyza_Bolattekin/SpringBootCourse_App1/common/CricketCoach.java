package com.Beyza_Bolattekin.SpringBootCourse_App1.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Primary
@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @PostConstruct
    public void doStartupStuff() {
        System.out.println("In doStartupStuff: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doCleanupStuff() {
        System.out.println("In doCleanupStuff: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "practise fast bowling for 15 mins.";
    }
}
