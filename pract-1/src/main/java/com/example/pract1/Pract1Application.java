package com.example.pract1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Pract1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Pract1Application.class, args);

		A ob1 = ctx.getBean(A.class);
		ob1.getDemo();

		A ob2 = ctx.getBean(A.class);
		ob2.getDemo();

	}

}
