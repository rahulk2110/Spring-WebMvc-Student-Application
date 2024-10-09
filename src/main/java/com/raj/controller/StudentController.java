package com.raj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.raj.entity.Student;
import com.raj.repo.StudentRepo;
import com.raj.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentRepo repo;

	@Autowired
	private StudentService service;

	@GetMapping("/")
	public String loadIndexPage(Model model) {
		formbind(model);
		return "index";
	}

	private void formbind(Model model) {
		model.addAttribute("Student", new Student());
		model.addAttribute("course", service.getCourse());
		model.addAttribute("timing",service.getTiming());
	}

	@PostMapping("/save")
	public String SaveStudent(Student s, Model model) {
		System.out.println(s);
		formbind(model);
		return "index";
	}

}
