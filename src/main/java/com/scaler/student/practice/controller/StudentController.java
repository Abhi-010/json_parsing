package com.scaler.student.practice.controller;

import com.scaler.student.practice.models.Student;
import com.scaler.student.practice.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("{id}")
    public Student getStudentByID(@PathVariable("id") Integer id){
        return studentService.getStudentByID(id);
    }

}
