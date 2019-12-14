package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class SpringsecurityFacebookOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityFacebookOauthApplication.class, args);
	}
}
