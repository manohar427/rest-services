package com.test;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;
	public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<UserDetails>  user = userRepository.findByUserName(username);
		user.orElseThrow(()->new UsernameNotFoundException("NOt Found"));
		return user.map(MyUserDetails::new ).get();
	}
}
