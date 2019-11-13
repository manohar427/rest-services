package com.test.service;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Path;

@Path("/users")
public class UserRestService {

	private static Map<Integer, User> INMEMORYDB = new HashMap<>();
	static {
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Pamela");
		user1.setLastName("Smith");

		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Louis");
		user2.setLastName("Lopez");
		
		INMEMORYDB.put(user1.getId(), user1);
		INMEMORYDB.put(user2.getId(), user2);
	}
}
