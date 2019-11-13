package com.test.demohazelcache2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DemoHazelCache1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoHazelCache1Application.class, args);
	}
}
