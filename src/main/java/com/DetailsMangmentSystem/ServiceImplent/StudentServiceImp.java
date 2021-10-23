package com.DetailsMangmentSystem.ServiceImplent;


import java.util.List;

import org.springframework.stereotype.Service;

import com.DetailsMangmentSystem.Entity.Student;
import com.DetailsMangmentSystem.Repository.StudentRepository;
import com.DetailsMangmentSystem.Services.StudentService;


@Service
public class StudentServiceImp implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImp(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}