package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResource {

	@GetMapping("/")
	public String getHome() {
		return "Application -Home";
	}

	@GetMapping("/user")
	public String getUser() {
		return "Application -User";
	}

	@GetMapping("/admin")
	public String getAdmin() {
		return "Application -Admin";
	}
}
