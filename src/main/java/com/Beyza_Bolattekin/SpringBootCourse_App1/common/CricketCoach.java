package com.Beyza_Bolattekin.SpringBootCourse_App1.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "practise fast bowling for 15 mins.";
    }
}
