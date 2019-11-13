package com.example.pract2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping(value = "/data1", method = RequestMethod.GET)
	public ModelAndView getData(Person p) {

		ModelAndView mv = new ModelAndView();
		mv.addObject("name11", p);
		mv.setViewName("index");
		return mv;
	}
}
