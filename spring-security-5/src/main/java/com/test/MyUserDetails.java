package com.test;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

@Component
public class MyUserDetails implements org.springframework.security.core.userdetails.UserDetails {

	private static final long serialVersionUID = -358505988816970493L;
	private String username;
	private String password;


	public MyUserDetails(UserDetails userDetails) {
		
		this.username = userDetails.getUserName();
		this.password = userDetails.getPassword();
		
	}

	public MyUserDetails() {
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"),new SimpleGrantedAuthority("ROLE_ADMIN"));
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		System.out.println("UserName11:" + username);
		return username;
	}

	public boolean isAccountNonExpired() {
		return true;
	}

	public boolean isAccountNonLocked() {
		return true;
	}

	public boolean isCredentialsNonExpired() {
		return true;
	}

	public boolean isEnabled() {
		return true;
	}
}
