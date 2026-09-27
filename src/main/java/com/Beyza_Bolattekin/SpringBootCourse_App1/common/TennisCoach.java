package com.Beyza_Bolattekin.SpringBootCourse_App1.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "train backhand for 30 mins";
    }
}
