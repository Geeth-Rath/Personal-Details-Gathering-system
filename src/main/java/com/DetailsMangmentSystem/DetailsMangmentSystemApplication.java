package com.DetailsMangmentSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.DetailsMangmentSystem.Entity.Instructor;
import com.DetailsMangmentSystem.Entity.Student;
import com.DetailsMangmentSystem.Entity.Teacher;
import com.DetailsMangmentSystem.Repository.InstructorRepository;
import com.DetailsMangmentSystem.Repository.StudentRepository;
import com.DetailsMangmentSystem.Repository.TeacherRepository;

@SpringBootApplication
public class DetailsMangmentSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DetailsMangmentSystemApplication.class, args);
	}
	

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Autowired
	private InstructorRepository instructorRepository;
	@Override
	public void run(String... args) throws Exception {
//		 Instructor student1 = new Instructor("Ramesh", "Fadatare", "ramesh@gmail.com");
//		 instructorRepository.save(student1);
//	
	}
}
