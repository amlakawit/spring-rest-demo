package com.gmail.mamlakawit.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.mamlakawit.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	//define endpoint for "/students" -return list of students
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Ayele", "Bayu"));
		students.add(new Student("Eliana", "Biruk"));
		students.add(new Student("Hibist", "Mena"));		
		
		return students;
		
	}
}
