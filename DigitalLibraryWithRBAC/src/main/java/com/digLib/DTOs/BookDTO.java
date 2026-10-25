package com.digLib.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BookDTO 
{
	@NotBlank(message="title cannot be empty")
	public String title;
	@NotBlank(message="author cannot be empty")
	public String author;
	@NotBlank(message="isbn cannot be empty")
	public String isbn;
	@NotBlank(message="category cannot be empty")
	public String category;

}
