package com.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myresource {

	@GetMapping("/abc")
	public String getName() {
		return "Manohar";
	}
}
