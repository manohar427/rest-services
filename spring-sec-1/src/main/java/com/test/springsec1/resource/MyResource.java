package com.test.springsec1.resource;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResource {

	@RequestMapping(value = "/")
	public String getName(@AuthenticationPrincipal final UserDetails user) {
		String username = user.getUsername();
		Collection<? extends GrantedAuthority> grau = user.getAuthorities();
		grau.forEach(System.out::println);

		return "Manohar";
	}
}
