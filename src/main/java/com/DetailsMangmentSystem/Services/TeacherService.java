package com.DetailsMangmentSystem.Services;

import java.util.List;

import com.DetailsMangmentSystem.Entity.Teacher;





public interface TeacherService {
	List<Teacher> getAllTeachers();
	
	Teacher saveTeacher(Teacher teacher);
	
	Teacher getTeacherById(Long id);
	
	Teacher updateTeacher(Teacher teacher);
	
	void deleteTeacherById(Long id);
}