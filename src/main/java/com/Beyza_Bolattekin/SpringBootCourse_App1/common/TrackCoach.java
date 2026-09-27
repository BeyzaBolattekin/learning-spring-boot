package com.Beyza_Bolattekin.SpringBootCourse_App1.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "run a hard 5 km";
    }

}
