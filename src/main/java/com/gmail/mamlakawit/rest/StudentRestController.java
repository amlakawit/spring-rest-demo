package com.gmail.mamlakawit.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.mamlakawit.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> students;

	// use @PostConstruct to lead student data
	@PostConstruct
	public void loadStudentData() {
		students = new ArrayList<>();
		students.add(new Student("Ayele", "Bayu"));
		students.add(new Student("Eliana", "Biruk"));
		students.add(new Student("Hibist", "Mena"));

	}

	// define endpoint for "/students" -return list of students
	@GetMapping("/students")
	public List<Student> getStudents() {
		return students;

	}

	// define endpoint for "/students/{id}" - get student at the given index in
	// the list
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) { 
		return students.get(studentId);
	}

}
