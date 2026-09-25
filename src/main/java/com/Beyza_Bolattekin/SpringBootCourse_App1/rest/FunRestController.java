package com.Beyza_Bolattekin.SpringBootCourse_App1.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @Value("${info.app.name}")
    private String appName;

    @Value("${info.app.version}")
    private String appVersion;

    @GetMapping("/appInfo")
    public String getAppInfo() {
        return "App Name is " + appName + "and version is " + appVersion;
    }

}
