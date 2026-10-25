package com.digLib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digLib.DTOs.BookDTO;
import com.digLib.entities.Book;
import com.digLib.service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/book")
public class BookController
{

	@Autowired
	BookService bookService;

	@GetMapping
	@PreAuthorize("permitAll()")
	public ResponseEntity<List<Book>> getAllBooks() {

		return new ResponseEntity<List<Book>>(bookService.getAllBooks(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Book> getBooksById(@PathVariable int id) {

		return new ResponseEntity<Book>(bookService.getBookById(id),HttpStatus.OK);
	}

	@PostMapping
	public Book addBook(@RequestBody @Valid BookDTO bookDTO) {

		return bookService.addBook(bookDTO);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/{id}")
	public Book updateBook(@PathVariable int id,@RequestBody BookDTO bookDTO) {
		return bookService.updateBook(id, bookDTO);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/{id}")
	public String deleteBook(@PathVariable int id) {
		return bookService.deleteBook(id);
	}

	@PreAuthorize("hasRole('USER','ADMIN')")
	@GetMapping("/search")
	public List<Book> searchBooks(
			@RequestParam(required=false)		String title,
			@RequestParam(required=false)		String author,
			@RequestParam(required=false)		String isbn,
			@RequestParam(required=false)		String category

			)
	{
		return bookService.searchBooks(title, author, isbn, category);
	}



}
