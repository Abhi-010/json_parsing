package com.scaler.student.practice;

import com.scaler.student.practice.models.Student;
import com.scaler.student.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentPracticeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentPracticeApplication.class, args);
	}

	@Autowired
	private StudentService studentService;


	@Override
	public void run(String... args) throws Exception {
		Student student = new Student();
		//student.setId(1);
		student.setName("Sri");
		student.setDepartment("CSE");
		studentService.addStudent(student);

		Student student1 = new Student();
		//student1.setId(2);
		student1.setName("Jo");
		student1.setDepartment("CSE");
		studentService.addStudent(student1);
	}
}
