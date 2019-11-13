package com.test.demopropprofile1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoPropProfile1Application implements CommandLineRunner {

	@Autowired
	private ServerProperties sp;

	public static void main(String[] args) {
		SpringApplication.run(DemoPropProfile1Application.class, args);
	}

	public void run(String... args) throws Exception {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+sp);
	}
}
