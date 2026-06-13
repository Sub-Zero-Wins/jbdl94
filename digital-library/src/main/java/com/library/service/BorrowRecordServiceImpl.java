package com.library.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entities.Books;
import com.library.entities.BorrowRecord;
import com.library.entities.User;
import com.library.repository.BookRepo;
import com.library.repository.BorrowRecordRepo;
import com.library.repository.UserRepo;

@Service
public class BorrowRecordServiceImpl implements BorrowRecordService {
	
	@Autowired
	BookRepo bookRepo;
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	BorrowRecordRepo brRepo;
	

	@Override
	public void borrowBook(int bookId, int userId)
	{
		Books book = bookRepo.findById(bookId).orElseThrow(()->new RuntimeException("book not found"));
		
		if(!book.isAvailability())
		{
			throw new RuntimeException("book currently unavailable");
		}
		
		User user = userRepo.findById(userId).orElseThrow(()->new RuntimeException("user not found in record"));
        
		BorrowRecord record = BorrowRecord.builder().book(book).user(user).borrowDate(LocalDate.now()).returned(false).build();
		
		book.setAvailability(false);
		
		brRepo.save(record);
		
		bookRepo.save(book);
	}

	@Override
	public void returnBook(int bookId, int userId) 
	{
		BorrowRecord record = brRepo.findByBookIdAndReturnedFalse(bookId).orElseThrow(()->new RuntimeException("br not found"));
		
		if(!(record.getUser().getId()==userId))
		{
			throw new RuntimeException("book was not borrowed by the given user");
		}
		
		record.setReturnDate(LocalDate.now());
		
		record.setReturned(true);
		Books book=record.getBook();
		book.setAvailability(true);
		
		bookRepo.save(book);
		brRepo.save(record);
		
	}

	@Override
	public List<BorrowRecord> getBorrowHistory(int userId) {
		// TODO Auto-generated method stub
		return brRepo.findByUserId(userId);
	}

}
