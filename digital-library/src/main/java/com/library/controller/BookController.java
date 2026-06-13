package com.library.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.DTOs.BookDTO;
import com.library.entities.Books;
import com.library.service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/book")
public class BookController
{

	@Autowired
	BookService bookService;

	@GetMapping
	public ResponseEntity<List<Books>> getAllBooks(@RequestParam(defaultValue="0",required=false) int pageNum ,@RequestParam String sortBy) {

		return new ResponseEntity<List<Books>>(bookService.getAllBooks(pageNum,sortBy),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Books> getBooksById(@PathVariable int id) {

		return new ResponseEntity<Books>(bookService.getBookId(id),HttpStatus.OK);
	}

	@PostMapping
	public Books addBook(@RequestBody @Valid BookDTO bookDTO) {

		return bookService.addBook(bookDTO);
	}
	
//	@PutMapping("/{id}")
//	public Books updateBook(@PathVariable int id,@RequestBody BookDTO bookDTO) {
//		return bookService.updateBook(id, bookDTO);
//	}

	//@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/{id}")
	public String deleteBook(@PathVariable int id) {
		return bookService.deleteBook(id);
	}

	@GetMapping("/search")
	public List<Books> searchBooks(
			@RequestParam(required=false)		String title,
			@RequestParam(required=false)		String author,
			@RequestParam(required=false)		String isbn,
			@RequestParam(required=false)		String category

			)
	{
		return bookService.searchBooks(title, author, isbn, category);
	}



}
