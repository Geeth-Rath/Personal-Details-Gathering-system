package com.DetailsMangmentSystem.ServiceImplent;

import java.util.List;

import org.springframework.stereotype.Service;

import com.DetailsMangmentSystem.Entity.Student;
import com.DetailsMangmentSystem.Entity.Teacher;
import com.DetailsMangmentSystem.Repository.StudentRepository;
import com.DetailsMangmentSystem.Repository.TeacherRepository;
import com.DetailsMangmentSystem.Services.TeacherService;

@Service
public class TeacherServiceImp implements TeacherService {

private TeacherRepository teacherRepository;
	
	public TeacherServiceImp(TeacherRepository teacherRepository) {
		super();
		this.teacherRepository = teacherRepository;
	}

	@Override
	public List<Teacher> getAllTeachers() {
		return teacherRepository.findAll();
	}


	@Override
	public Teacher saveTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@Override
	public Teacher getTeacherById(Long id) {
		return teacherRepository.findById(id).get();
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@Override
	public void deleteTeacherById(Long id) {
		teacherRepository.deleteById(id);	
		
	}

	
}
