package com.digLib.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digLib.entities.User;

public interface UserRepository extends JpaRepository<User,Integer>
{

  
  Optional<User> findByUsername(String username);
  
  
}
