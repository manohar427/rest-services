package com.example.pract4;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

//public interface StudentRepo extends CrudRepository<Student, Integer>{
public interface StudentRepo extends JpaRepository<Student, Integer>{
	List<Student> findByName(String arg0);
	List<Student> findByIdGreaterThan(Integer id);
	@Query("from Student where address=?1 order by name")
	List<Student> findByNameSorted(String address);
}