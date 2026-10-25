package com.digLib.service;

import java.util.List;

import com.digLib.DTOs.BookDTO;
import com.digLib.entities.Book;

public interface BookService
{
	List<Book> getAllBooks();
	Book getBookById(int id);
	Book addBook(BookDTO bookDTO);
	String deleteBook(int id);
	Book updateBook(int id, BookDTO bookDTO);
	List<Book> searchBooks(String title,String author,String isbn,String category);
	


}
