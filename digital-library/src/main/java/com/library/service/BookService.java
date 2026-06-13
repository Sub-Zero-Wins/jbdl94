package com.library.service;

import java.util.List;

import com.library.DTOs.BookDTO;
import com.library.entities.Books;

public interface BookService 
{
	List<Books> getAllBooks(int pageNum, String sortBy);
	Books getBookId(int id);
	Books addBook(BookDTO bookDTO);
	String deleteBook(int id);
	List<Books> searchBooks(String title,String author,String isbn,String category);
	
	
}
