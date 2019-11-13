package com.example.demo5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentTempRepository {

	@Autowired
	JdbcTemplate temp;

	public List<Student> getStudent() {
		return temp.query("select * from student", new StudentRowMapper());
	}
}
