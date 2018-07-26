package com.gmail.mamlakawit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldRestController {
	
	@GetMapping("/helloworld") //REST endpoint 
	public String HelloWorld(){
		
		return "Hello World!";
	}

}
