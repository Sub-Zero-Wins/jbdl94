package com.library.DTOs;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDTO 
{
	
	
	@NotBlank(message="email cannot be empty")
	private String email;
	@NotBlank(message="password cannot be empty")
	private String password;

}
