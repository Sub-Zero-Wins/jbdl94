package com.library.service;

import com.library.DTOs.UserRegisterDTO;
import com.library.entities.User;

public interface UserService 
{
	boolean register(UserRegisterDTO request);
	User login(String email,String password);

}
