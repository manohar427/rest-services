package com.test.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/messages")
public class Messenger {

	@Produces(MediaType.TEXT_PLAIN)
	@GET
	public String getMessages(){
		return "Hi hellow how are you ?";
	}
}

//https://www.youtube.com/watch?v=oQfVVef4I_A&list=PLzS3AYzXBoj9f7k7jtiMpQblUGv0lO5Js