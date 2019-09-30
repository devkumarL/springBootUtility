package com.devkumar.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


	@RequestMapping("/")
	public String welcome1() {
		return "Welcome to localhost";
	}
	
	@RequestMapping("/hello")
	public String welcome() {
		return "Welcome to Spring boot";
	}
}
