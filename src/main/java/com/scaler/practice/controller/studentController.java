package com.scaler.practice.controller;

import com.scaler.practice.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class studentController {

    
    private String name ;
    @GetMapping("/get")
    public Student getStudent(){

        return new Student("abhi",33);
    }
}
