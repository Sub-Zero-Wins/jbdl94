package com.library.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.entities.Books;

public interface BookRepo  extends JpaRepository<Books,Integer>{

	List<Books> findByIsbnIgnoreCase(String isbn);

	List<Books> findByAuthorIgnoreCase(String author);

	List<Books> findByTitleIgnoreCase(String title);

	List<Books> findByCategoryIgnoreCase(String category);



}
