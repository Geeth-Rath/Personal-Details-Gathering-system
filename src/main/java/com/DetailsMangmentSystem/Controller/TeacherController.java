package com.DetailsMangmentSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.DetailsMangmentSystem.Entity.Student;
import com.DetailsMangmentSystem.Entity.Teacher;
import com.DetailsMangmentSystem.Services.TeacherService;

@Controller
public class TeacherController {

	private TeacherService teacherService;

	public TeacherController(TeacherService teacherService) {
		super();
		this.teacherService = teacherService;
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/teachers")
	public String listTeacher(Model model) {
		model.addAttribute("teachers", teacherService.getAllTeachers());
		return "teachers";
	}
	
	@GetMapping("/teachers/new")
	public String createStudentForm(Model model) {
		
		// create teacher object to hold teacher form data
		Teacher teacher = new Teacher();
		model.addAttribute("teacher", teacher);
		return "teacher_Create";
	}
	
	
	@PostMapping("/teachers")
	public String saveTeachert(@ModelAttribute("teacher") Teacher teacher) {
		teacherService.saveTeacher(teacher);
		return "redirect:/teachers";
	}
	
	@GetMapping("/teachers/edit/{id}")
	public String editTeacherForm(@PathVariable Long id, Model model) {
		model.addAttribute("teacher", teacherService.getTeacherById(id));
		return "teacher_Update";
	}

	@PostMapping("/teachers/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Teacher teacher,
			Model model) {
		
		// get Teacher from database by id
		
		Teacher existingTeacher = teacherService.getTeacherById(id);
		existingTeacher.setTid(id);
		existingTeacher.settFirstName(teacher.gettFirstName());
		existingTeacher.settLastName(teacher.gettLastName());
		existingTeacher.settEmail(teacher.gettEmail());
		
		// save updated Teacher object
		teacherService.updateTeacher(existingTeacher);
		return "redirect:/teachers";		
	}
	
	@GetMapping("/teachers/{id}")
	public String deleteTeacher(@PathVariable Long id) {
		teacherService.deleteTeacherById(id);
		return "redirect:/teachers";
	}

	
}
