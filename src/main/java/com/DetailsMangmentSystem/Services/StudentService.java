package com.DetailsMangmentSystem.Services;

import java.util.List;

import com.DetailsMangmentSystem.Entity.Student;



public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}