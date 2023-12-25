package com.scaler.student.practice.service;

import com.scaler.student.practice.models.Student;
import com.scaler.student.practice.repository.StudentRespository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    private StudentRespository studentRespository;

    public StudentServiceImpl(StudentRespository studentRespository){
        this.studentRespository = studentRespository;
    }

    @Override
    public void addStudent(Student student) {
        studentRespository.save(student);
    }

    @Override
    public Student getStudentByID(int id) {
        Optional<Student> s =  studentRespository.findById(id);
        return s.get();
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRespository.findAll();
    }
}
