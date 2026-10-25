package com.digLib.service;

import java.util.List;

import com.digLib.entities.BorrowRecord;

public interface BorrowService
{
	 void borrowBook(int bookId,int userId);
	 void returnBook(int bookId,int userId);
	 List<BorrowRecord> getBorrowHostory(int userId);
  
}
