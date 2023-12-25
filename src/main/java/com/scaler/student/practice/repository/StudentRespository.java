package com.scaler.student.practice.repository;

import com.scaler.student.practice.models.Student;
import org.springframework.data.jpa.repository.JpaContext;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRespository extends JpaRepository<Student,Integer> {

}
