package com.example.pract1;

import org.springframework.stereotype.Component;

@Component("test")
public class B {
	public B() {
		System.err.println("B>>>>>>>>");
	}
	
	public void getComputer(){
		System.out.println("Demo from B");
	}
}
