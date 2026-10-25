package com.digLib.DTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class UserRegisterRequest 
{
	@NotBlank(message="username is required")
	@Email(message="invalid email format")
	private String username;
	
	@NotBlank(message="password is required")
	@Size(min=8,message="password must be at least 8 characters long")//add a custom validation
	private String password;
}
