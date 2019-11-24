package com.test.springsec1.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class MySecurity extends WebSecurityConfigurerAdapter {

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("mano").password("{noop}123").roles("user").and().
		                              withUser("abc").password("{noop}123").roles("admin");
	}
	
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		//.antMatchers("**/")
		.anyRequest().fullyAuthenticated()
		.and().httpBasic();
		http.csrf().disable();
	}
}
