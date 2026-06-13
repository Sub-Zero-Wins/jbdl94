package com.library.DTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRegisterDTO
{
	
	@NotBlank(message="name is required feild")
	private String username;
	
	@NotBlank(message="email is required feild")
	@Email(message="please enter valid email")
	private String email;
	
	@NotBlank(message="password is required feild")
	@Size(min=8,message="password must be at least 8 character")
	private String password;
	

}
