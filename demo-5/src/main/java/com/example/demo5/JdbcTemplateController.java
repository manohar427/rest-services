package com.example.demo5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdbcTemplateController {

	@Autowired
	StudentTempRepository repo;

	@GetMapping("jstudent")
	@Transactional
	public List<Student> getStudent() {
		return repo.getStudent();
	}
}
