package com.test.demotransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ApplicationStartupRunnerOne implements CommandLineRunner {

	@Autowired
	JdbcTemplate temp;

	@Transactional(timeout=1)
	public void run(String... args) throws Exception {
		System.out.println("ARGS 1:" + args);
		String all[] = { "ABC", "DEF", "OLM", null,"ABC", "DEF", "OLM", null,"ABC", "DEF", "OLM", null,"ABC", "DEF", "OLM", null,"ABC", "DEF", "OLM", null };
		for (String name : all) {
			temp.update("insert into BOOKINGS(FIRST_NAME) values (?)", name);
		}

	}
}
