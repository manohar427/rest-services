package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResource {

	@Autowired
	AuthenticationManager authMan;

	@Autowired
	MyUserDetailsService myUserDetailsService;

	@Autowired
	JwtUtil jwtUtil;

	@RequestMapping({ "/hello" })
	public String getHome() {
		return "Hi from - Home";
	}

	@RequestMapping(value = "/authentication", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest aureq) throws Exception {

		try {
			authMan.authenticate(new UsernamePasswordAuthenticationToken(aureq.getUsername(), aureq.getPassword()));
			System.out.println("ONE");
		} catch (AuthenticationException e) {
			System.out.println("TWO");
			throw new Exception("UN and PW is wrong", e);
		}
		System.out.println("THREE");
		UserDetails loadUserByUsername = myUserDetailsService.loadUserByUsername(aureq.getUsername());
		System.out.println("FOUR:" + loadUserByUsername);
		String generateToken = jwtUtil.generateToken(loadUserByUsername);
		System.out.println("FIVE:" + generateToken);
		return ResponseEntity.ok(new AuthenticationRespose(generateToken));
	}
}
