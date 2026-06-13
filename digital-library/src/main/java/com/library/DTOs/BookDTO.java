package com.library.DTOs;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDTO 
{
	@NotBlank(message="title is required")
	private String title;
	@NotBlank(message="author is required")
	private String author;
	@NotBlank(message="isbn is required")
	private String isbn;
	@NotBlank(message="availability is required")
	private boolean availability;
	@NotBlank(message="category is required")
	private String category;
	@NotBlank(message="stock is required")
	private int stock;
}
