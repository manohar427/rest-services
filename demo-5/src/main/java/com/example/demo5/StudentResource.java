package com.example.demo5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResource {

	@Autowired
	StudentRepository stdRep;

	public StudentResource() {
		System.out.println(">>>>>>>>>>>>StudentResource()>>>>>>>>");
	}

	@PostMapping("student")
	public List<Student> saveStudent(@RequestBody Student std) {
		stdRep.save(std);
		System.out.println(">>>>>>>>>>>>StudentResource()>>>>>>>> SAVE"+std);
		return stdRep.findAll();
	}
	
	@GetMapping("student")
	public List<Student> getStudent() {
		return stdRep.findAll();
	}
}
