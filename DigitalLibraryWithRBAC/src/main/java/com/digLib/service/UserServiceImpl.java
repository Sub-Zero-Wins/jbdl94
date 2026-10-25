package com.digLib.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.digLib.DTOs.UserRegisterRequest;
import com.digLib.entities.Role;
import com.digLib.entities.User;
import com.digLib.repository.RoleRepository;
import com.digLib.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	RoleRepository roleRepo;
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	
	@Override
	public void register(UserRegisterRequest request)
	{
		System.out.println(request);
		if(userRepo.findByUsername(request.getUsername()).isPresent())
		{
			throw new RuntimeException("email already registered");
		}
		
		Set<Role> roles = new HashSet<>();

		Role role = roleRepo.findByName("USER")
		        .orElseThrow(() -> new RuntimeException("USER role not found"));

		roles.add(role);
		User user = new User().builder().username(request.getUsername()).password(encoder.encode(request.getPassword())).enabled(true).roles(roles).build();
	
		System.out.println(user);
		userRepo.save(user);
		
	}

	@Override
	public User login(String email, String password) {

	    User user = userRepo.findByUsername(email)
	            .orElseThrow(() -> new RuntimeException("Invalid Credentials"));

	    if (!encoder.matches(password, user.getPassword())) {
	        throw new RuntimeException("Invalid Credentials");
	    }

	    return user;
	}

	@Override
	public User getUserById(int id) {
		
		return userRepo.findById(id).get();
	}

}
