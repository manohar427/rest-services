package com.test;

public class AuthenticationRespose {

	private String jwt;

	public AuthenticationRespose(String jwt) {
		this.jwt = jwt;
	}

	public String getJwt() {
		return jwt;
	}
}
