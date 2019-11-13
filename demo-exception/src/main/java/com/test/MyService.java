package com.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MyService {

	public List<String> getData() {
		List<String> li = new ArrayList<>();
		li.add("ABC");
		li.add("BCD");
		li.add("DEF");
		
		return li;
	}
}
