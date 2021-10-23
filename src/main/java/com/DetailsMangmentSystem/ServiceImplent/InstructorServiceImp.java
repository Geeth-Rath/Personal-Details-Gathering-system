package com.DetailsMangmentSystem.ServiceImplent;

import java.util.List;

import org.springframework.stereotype.Service;

import com.DetailsMangmentSystem.Entity.Instructor;
import com.DetailsMangmentSystem.Repository.InstructorRepository;
import com.DetailsMangmentSystem.Services.InstructorService;


@Service
public class InstructorServiceImp implements InstructorService{

	private InstructorRepository instructorRepository;
	
	public InstructorServiceImp(InstructorRepository instructorRepository) {
		super();
		this.instructorRepository = instructorRepository;
	}
	
	
	@Override
	public List<Instructor> getAllInstructors() {
		return instructorRepository.findAll();
	}

	@Override
	public Instructor saveInstructor(Instructor instructor) {
		return instructorRepository.save(instructor);
	}

	@Override
	public Instructor getInstructorById(Long id) {
		return instructorRepository.findById(id).get();
	}

	@Override
	public Instructor updateInstructor(Instructor instructor) {
		return instructorRepository.save(instructor);
	}

	@Override
	public void deleteInstructorById(Long id) {
		instructorRepository.deleteById(id);	
		
	}

}
