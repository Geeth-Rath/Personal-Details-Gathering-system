package com.DetailsMangmentSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.DetailsMangmentSystem.Entity.Instructor;

import com.DetailsMangmentSystem.Services.InstructorService;


@Controller
public class InstructorController {

	private InstructorService instructorService;

	public InstructorController(InstructorService instructorService) {
		super();
		this.instructorService = instructorService;
	}
	
	// handler method to handle list instructors and return mode and view
	@GetMapping("/instructors")
	public String listInstructors(Model model) {
		model.addAttribute("instructor", instructorService.getAllInstructors());
		return "instructors";
	}
	
	@GetMapping("/instructors/new")
	public String createInstructorForm(Model model) {
		
		// create Instructor object to hold Instructor form data
		Instructor instructor = new Instructor();
		model.addAttribute("instructor", instructor);
		return "instructors_Create";
		
	}
	
	@PostMapping("/instructors")
	public String saveInstructor(@ModelAttribute("instructor") Instructor instructor) {
		instructorService.saveInstructor(instructor);
		return "redirect:/instructors";
	}
	
	@GetMapping("/instructors/edit/{id}")
	public String editInstructorForm(@PathVariable Long id, Model model) {
		model.addAttribute("instructor", instructorService.getInstructorById(id));
		return "instructors_Update";
	}

	@PostMapping("/instructors/{id}")
	public String updateInstructor(@PathVariable Long id,
			@ModelAttribute("instructor") Instructor instructor,
			Model model) {
		
		// get Instructor from database by id
		Instructor existingInstructor = instructorService.getInstructorById(id);
		existingInstructor.setId(id);
		existingInstructor.setFirstName(instructor.getFirstName());
		existingInstructor.setLastName(instructor.getLastName());
		existingInstructor.setEmail(instructor.getEmail());
		
		// save updated instructor object
		instructorService.updateInstructor(existingInstructor);
		return "redirect:/instructors";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/instructors/{id}")
	public String deleteInstructor(@PathVariable Long id) {
		instructorService.deleteInstructorById(id);
		return "redirect:/instructors";
	}
	
}
