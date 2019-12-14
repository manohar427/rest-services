package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("USER NAME::::::::::::::::::::::::::::::::"+username);
		Users user = userRepo.findByName(username);
		System.out.println("USER NAME::::::::::::::::::::::::::::::::"+user);
		if (user == null)
			throw new UsernameNotFoundException("No User 404");
		return new UserPrincipals(user);
	}
}
