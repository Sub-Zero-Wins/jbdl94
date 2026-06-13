package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.DTOs.UserRegisterDTO;
import com.library.entities.User;
import com.library.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepo userRepo;

	@Override
	public boolean register(UserRegisterDTO request) {
		if(userRepo.findByEmailIgnoreCase(request.getEmail()).isPresent())
		{
			throw new RuntimeException("user already exists");
		}
		User user = User.builder().username(request.getUsername()).email(request.getEmail()).password(request.getPassword()).role("USER").build();
		userRepo.save(user);
		return true;
	}

	@Override
	public User login(String email, String password) {	
		return userRepo.findByEmailIgnoreCase(email).filter(u->u.getPassword().equals(password)).orElseThrow(()->new RuntimeException("invalid credentials"));
	}

}
