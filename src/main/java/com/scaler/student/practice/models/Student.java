package com.scaler.student.practice.models;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    //@GeneratedValue
    @GeneratedValue(generator = "student_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name="student_gen",sequenceName = "student_seq",initialValue = 50,allocationSize = 1)
    private Integer id;
    private String name;
    private String department;
}
