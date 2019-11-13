package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

	List<Student> list = new ArrayList<>();
	Connection con;

	public StudentRepository() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "tester");
		} catch (Exception e) {

		}

	}

	public List<Student> getStudents() {

		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			while (rs.next()) {
				Student std = new Student();
				std.setId(rs.getInt(1));
				std.setName(rs.getString(2));
				list.add(std);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	public List<Student> save(Student std) {
		list.add(std);
		return list;
		
	}

	public Student getStudent(int id) {
		Student std = new Student();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student where id=" + id);

			while (rs.next()) {

				std.setId(rs.getInt(1));
				std.setName(rs.getString(2));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return std;
	}
}
