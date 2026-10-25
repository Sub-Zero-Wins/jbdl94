package com.digLib.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digLib.entities.BorrowRecord;

public interface BorrowRecordRepository extends JpaRepository<BorrowRecord,Integer>
{
	List<BorrowRecord> findByUserId(int userId);
	Optional<BorrowRecord> findByBookIdAndReturnedFalse(int bookId);
}
