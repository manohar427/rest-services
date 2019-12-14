package com.test.springsec1.security;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

@Component
public class CustomFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		System.out.println("doFilter >>>>>>>>>>>>"+req.getUserPrincipal());
	}

	public void destroy() {
		System.out.println("destroy >>>>>>>>>>>>");
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init >>>>>>>>>>>>");
	}
}
