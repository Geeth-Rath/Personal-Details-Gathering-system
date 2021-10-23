package com.DetailsMangmentSystem.Services;

import java.util.List;

import com.DetailsMangmentSystem.Entity.Instructor;


public interface InstructorService {
	List<Instructor> getAllInstructors();
	
	Instructor saveInstructor(Instructor instructor);
	
	Instructor getInstructorById(Long id);
	
	Instructor updateInstructor(Instructor instructor);
	
	void deleteInstructorById(Long id);
}
