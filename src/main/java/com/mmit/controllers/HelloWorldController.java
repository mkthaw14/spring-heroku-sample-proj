package com.mmit.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/api/hello-world")
	public String helloWorld()
	{
		return "hello world";
	}
	
	
}
