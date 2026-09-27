package com.Beyza_Bolattekin.SpringBootCourse_App1.common;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "swim for 2 km";
    }

}
