package com.example.pract1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class A {

	@Autowired
	@Qualifier("test")
	B b;
	public A() {
		System.err.println("A>>>>>>>>>>>");
	}

	public void getDemo() {
		System.out.println("Demo-A");
		b.getComputer();
	}
}
