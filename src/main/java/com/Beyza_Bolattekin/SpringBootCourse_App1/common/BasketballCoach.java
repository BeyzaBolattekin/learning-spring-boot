package com.Beyza_Bolattekin.SpringBootCourse_App1.common;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    public BasketballCoach() {
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "shoot 15 dunks";
    }

}
