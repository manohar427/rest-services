package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping(value = "/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping(value = "/login")
	public String loginPage() {
		return "login.jsp";
	}

	@RequestMapping(value = "/logout-success")
	public String logoutPage() {
		return "logout.jsp";
	}
}
