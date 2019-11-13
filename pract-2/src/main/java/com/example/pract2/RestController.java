package com.example.pract2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public Topic getData() {
		System.out.println("Demo Data-RestController");
		Topic t = new Topic("a", "Java", "Java Desc");
		return t;
	}
}
