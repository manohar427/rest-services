package com.test.demoproperty1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProperty1Application implements CommandLineRunner {

	@Autowired
	private MyProperties props;
	public static void main(String[] args) {
		SpringApplication.run(DemoProperty1Application.class, args);
	}

	public void run(String... args) throws Exception {
		System.out.println("NAME::::::::::::::::::::"+props);
	}
}
