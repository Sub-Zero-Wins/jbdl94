package com.digLib.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digLib.entities.Book;
import com.digLib.entities.BorrowRecord;
import com.digLib.entities.User;
import com.digLib.repository.BookRepository;
import com.digLib.repository.BorrowRecordRepository;
import com.digLib.repository.UserRepository;
import com.digLib.util.BookNotFoundException;

@Service
public class BorrowServiceImpl implements BorrowService {


	@Autowired
	private BorrowRecordRepository borrowRecordRepo;

	@Autowired
	private BookRepository bookRepo;

	@Autowired
	private UserRepository userRepo;


	@Override
	public void borrowBook(int bookId, int userId) 
	{
		Book book = bookRepo.findById(bookId).orElseThrow(()->new BookNotFoundException("book not found with id :"+bookId));

		if(!book.isAvailable())
		{
			throw new RuntimeException("Book is already borrowed");
		}

		User user = userRepo.findById(userId).orElseThrow(()->new RuntimeException("user not found with id :"+userId));

		BorrowRecord record = new BorrowRecord().builder().book(book).user(user).borrowDate(LocalDate.now()).returned(false).build();

		book.setAvailable(false);

		borrowRecordRepo.save(record);
		bookRepo.save(book);
	}

	@Override
	public void returnBook(int bookId, int userId)
	{
		BorrowRecord record= borrowRecordRepo.findByBookIdAndReturnedFalse(bookId).orElseThrow(()->new RuntimeException("Borrow record not found"));

		if(!(record.getUser().getId()==userId))
		{
			throw new RuntimeException("this book was not borrowed by this user");
		}

		record.setReturnDate(LocalDate.now());
		record.setReturned(true);

		Book book= record.getBook();
		book.setAvailable(true);

		borrowRecordRepo.save(record);
		bookRepo.save(book);
	}

	@Override
	public List<BorrowRecord> getBorrowHostory(int userId)
	{
		return borrowRecordRepo.findByUserId(userId);
	}

}
