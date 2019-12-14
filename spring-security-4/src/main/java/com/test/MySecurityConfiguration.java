package com.test;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class MySecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery("select username,password,enabled from my_users where username=?")
		.authoritiesByUsernameQuery("select username,authority from my_authorities where username=?");
		
		//Default DB 
		//.withDefaultSchema();
				//.withUser(User.withUsername("abc").password("abc").roles("USER"))
				//.withUser(User.withUsername("pqr").password("pqr").roles("ADMIN"));
	}

	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/user").hasAnyRole("USER", "ADMIN").antMatchers("/admin").hasRole("ADMIN")
				.antMatchers("/").permitAll().and().formLogin();
	}

	@Bean
	public PasswordEncoder getPwd() {
		return NoOpPasswordEncoder.getInstance();
	}
}
