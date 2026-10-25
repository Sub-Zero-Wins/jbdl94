package com.digLib.service;

import com.digLib.DTOs.UserRegisterRequest;
import com.digLib.entities.User;

public interface UserService 
{
	void register(UserRegisterRequest request);
	User login(String email,String password);

	User getUserById(int id);

}
