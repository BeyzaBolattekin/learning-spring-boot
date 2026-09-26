package com.Beyza_Bolattekin.SpringBootCourse_App1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Beyza_Bolattekin.SpringBootCourse_App1.common.Coach;

@RestController
public class DemoController {
    private Coach myCoach;

    public DemoController(Coach theCoach) {
        myCoach = theCoach;

    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
