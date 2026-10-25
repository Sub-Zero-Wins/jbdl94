package com.digLib.DTOs;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LoginDTO 
{
	@NotBlank(message="email cannot be empty")
	private String email;
	@NotBlank(message="password cannot be empty")
	private String password;

}
