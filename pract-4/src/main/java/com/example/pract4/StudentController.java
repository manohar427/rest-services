package com.example.pract4;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StudentController {

	@Autowired
	StudentRepo srepo;

	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}

	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student std) {
		srepo.save(std);
		return std;
	}

	@RequestMapping("/getStd")
	public ModelAndView getStudent(@RequestParam Integer id) {
		Student std = srepo.findById(id).orElse(new Student());
		ModelAndView mv = new ModelAndView();
		mv.addObject("std", std);
		mv.setViewName("std.jsp");
		return mv;
	}
	
	@RequestMapping("/getName")
	public ModelAndView getStudent(@RequestParam String name) {
		List<Student> std = srepo.findByName(name);
		ModelAndView mv = new ModelAndView();
		mv.addObject("std", std);
		mv.setViewName("std.jsp");
		return mv;
	}
	
	@RequestMapping("/greatId")
	public ModelAndView greatId(@RequestParam Integer id) {
		List<Student> std = srepo.findByIdGreaterThan(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("std", std);
		mv.setViewName("std.jsp");
		return mv;
	}
	
	@RequestMapping("/orderByName")
	public ModelAndView orderByName(@RequestParam String address) {
		List<Student> std = srepo.findByNameSorted(address);
		ModelAndView mv = new ModelAndView();
		mv.addObject("std", std);
		mv.setViewName("std.jsp");
		return mv;
	}
	
	
	//@RequestMapping("/students")
	@RequestMapping(value="/students",produces={"application/xml","application/json"})
	public List<Student> students() {
		return srepo.findAll();
	}
	
	@RequestMapping("/students/{sid}")
	public Optional<Student> studentId(@PathVariable("sid") Integer id) {
		return srepo.findById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
}
