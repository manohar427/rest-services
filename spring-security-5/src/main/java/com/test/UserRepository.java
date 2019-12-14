package com.test;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails, String> {
	Optional<UserDetails> findByUserName(String name);
}
