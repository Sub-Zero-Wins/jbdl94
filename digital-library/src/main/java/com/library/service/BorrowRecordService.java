package com.library.service;

import java.util.List;

import com.library.entities.BorrowRecord;

public interface BorrowRecordService 
{
	void borrowBook(int bookId,int userId);
	void returnBook(int bookId,int userId);
	List<BorrowRecord> getBorrowHistory(int userId);

}
