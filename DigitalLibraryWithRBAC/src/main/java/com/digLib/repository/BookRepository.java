package com.digLib.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digLib.entities.Book;

public interface BookRepository extends JpaRepository<Book,Integer>
{
	List<Book> findByCategoryIgnoreCase(String category);
	List<Book> findByTitleContainingIgnoreCase(String title);
	Optional<Book> findByIsbn(String isbn);
	List<Book> findByAuthorIgnoreCase(String author);
	

}
