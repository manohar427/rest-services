package com.test;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/students")
public class StudentResource {

	StudentRepository stdRep = new StudentRepository();

	public StudentResource() {
		System.out.println(">>>>>>>>>>>>StudentResource()>>>>>>>>");
	}
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Student> getStudent() {
		//System.out.println("NOW LIST DATA:"+list);
		return stdRep.getStudents();
	}

	@GET
	//@Produces(MediaType.APPLICATION_XML)
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Path("{id}")
	public Student getStudent(@PathParam("id") int id) {
		//System.out.println("NOW LIST DATA:"+list);
		return stdRep.getStudent(id);
	}
	
	@POST
	//@Path("student")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Student saveStudent(Student std) {
       System.out.println(">>>>>>>>>>>>>>>>>>>>:"+std);
		stdRep.save(std);
		return std;
	}
	
	
	
	@DELETE
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Path("{id}")
	public List<Student> deleteStudent(@PathParam("id") int id) {
		System.out.println("DELETE ID:"+id);
		return stdRep.getStudents();
	}
	
	
}
