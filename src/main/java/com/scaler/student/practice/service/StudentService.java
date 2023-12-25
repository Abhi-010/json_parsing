package com.scaler.student.practice.service;

import com.scaler.student.practice.models.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);
    Student getStudentByID(int id);
    List<Student> getAllStudent();
}
