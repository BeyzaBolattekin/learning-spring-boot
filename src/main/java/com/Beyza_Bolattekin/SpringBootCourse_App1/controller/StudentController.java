package com.Beyza_Bolattekin.SpringBootCourse_App1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Beyza_Bolattekin.SpringBootCourse_App1.model.Student;

import jakarta.validation.Valid;

@Controller
public class StudentController {

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @Value("${systems}")
    private List<String> systems;

    @GetMapping("/showStudentForm")
    public String showForm(Model theModel) {

        Student theStudent = new Student();
        theModel.addAttribute("student", theStudent);
        theModel.addAttribute("countries", countries);
        theModel.addAttribute("languages", languages);
        theModel.addAttribute("systems", systems);
        return "student-form";
    }

    @PostMapping("processStudentForm")
    public String processForm(
            @Valid @ModelAttribute("student") Student theStudent,
            BindingResult theBindingResult,
            Model theModel) {

        System.out.println("binding results : " + theBindingResult.toString() + "\n \n \n");
        if (theBindingResult.hasErrors()) {
            theModel.addAttribute("countries", countries);
            theModel.addAttribute("languages", languages);
            theModel.addAttribute("systems", systems);
            return "student-form";
        } else {
            return "student-confirmation";
        }
    }

}
