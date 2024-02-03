package com.example.LoginRestApi;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long>{

	Optional<Users> findByEmail(String email);
	Optional<Users> findByUsernameOrEmail(String username, String email);
	Optional<Users> findByUsername(String username);
}
