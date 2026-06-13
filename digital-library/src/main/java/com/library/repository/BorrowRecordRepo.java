package com.library.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.entities.Books;
import com.library.entities.BorrowRecord;

public interface BorrowRecordRepo  extends JpaRepository<BorrowRecord,Integer>{

	Optional<BorrowRecord> findByBookIdAndReturnedFalse(int bookId);

	List<BorrowRecord> findByUserId(int userId);

}
