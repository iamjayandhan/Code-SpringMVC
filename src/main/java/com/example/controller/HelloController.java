package com.example.controller; // This belongs to this package!

//import annotations!
//1. @Controller
import org.springframework.stereotype.Controller;
//2. @RequestMapping
import org.springframework.web.bind.annotation.RequestMapping;
//3. @GetMapping
import org.springframework.web.bind.annotation.GetMapping;

@Controller   //marks HelloController as a Spring MVC controller.
@RequestMapping("/HelloSpringMVC")
public class HelloController {
	@GetMapping("/")
	public String display() {
		return "index";
	}
	
	@GetMapping("/secret")
	public String secret() {
		return "secret";
	}
}
