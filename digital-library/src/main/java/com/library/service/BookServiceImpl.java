package com.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.library.DTOs.BookDTO;
import com.library.entities.Books;
import com.library.repository.BookRepo;
import com.library.util.BookNotFoundException;

@Service
public class BookServiceImpl implements BookService
{
	@Autowired 
	BookRepo bookRepo;

	@Override
	public List<Books> getAllBooks(int pageNum, String sortBy) {
		Sort sort=Sort.by(sortBy);
		Pageable pageable = PageRequest.of(0, 5,sort);
		return bookRepo.findAll(pageable).getContent();
	}

	@Override
	public Books getBookId(int id) {
		return bookRepo.findById(id).orElseThrow(()->new BookNotFoundException("no book found with id :"+id));
	}

	@Override
	public Books addBook(BookDTO bookDTO) 
	{
		Books books = Books.builder().title(bookDTO.getTitle()).isbn(bookDTO.getIsbn()).author(bookDTO.getAuthor()).availability(bookDTO.isAvailability()).category(bookDTO.getCategory()).stock(bookDTO.getStock()).build();
		return bookRepo.save(books);
	}

	@Override
	public String deleteBook(int id) {
		String result;
		if(bookRepo.findById(id)!=null) {
			bookRepo.deleteById(id);
			result= "book Deleted with id :"+id;
		}
		result="book not found with id :"+id;
		return result;
	}

	@Override
	public List<Books> searchBooks(String title, String author, String isbn , String category) {

	if(isbn!=null && !isbn.isEmpty()) {
		return bookRepo.findByIsbnIgnoreCase(isbn);
	}
	
	if(author!=null && !author.isEmpty()) {
		return bookRepo.findByAuthorIgnoreCase(author);
	}
	
	if(title!=null && !title.isEmpty()) {
		return bookRepo.findByTitleIgnoreCase(title);
	}
	
	if(category!=null && !category.isEmpty()) {
		return bookRepo.findByCategoryIgnoreCase(category);
	}
	return getAllBooks(0,title);
}

}
