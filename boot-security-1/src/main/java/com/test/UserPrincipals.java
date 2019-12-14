package com.test;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class UserPrincipals implements UserDetails {

	private static final long serialVersionUID = 3085696193169848729L;
	private Users user;

	public UserPrincipals(Users user) {
		super();
		this.user = user;
	}

	public UserPrincipals() {
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.singleton(new SimpleGrantedAuthority("USER"));
	}

	public String getPassword() {
		return user.getPassword();
	}

	public String getUsername() {
		return user.getName();
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
