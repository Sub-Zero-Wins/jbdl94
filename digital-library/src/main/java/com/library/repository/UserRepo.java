package com.library.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.entities.User;

public interface UserRepo extends JpaRepository<User,Integer>{

	Optional<User> findByEmailIgnoreCase(String email);

}
