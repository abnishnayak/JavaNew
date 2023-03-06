package com.abnishn.service;

import com.abnishn.bookrepo.BookRepo;
import com.abnishn.model.Books;

import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service

public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepo bookRepo;
	
	public Books saveBook(Books books) {
		return bookRepo.save(books);
	}
	public List<Books> getAllBooks(){
		return (List<Books>)bookRepo.findAll();
	}
	
	public Books updateBook(Books books, int bookid) {
		Books bookDB=bookRepo.findById(bookid).get();
		
		 if (Objects.nonNull(books.getBookname())
		            && !"".equalsIgnoreCase(books.getBookname())) {
		            bookDB.setBookname(books.getBookname());
		        }
		 
		        if (Objects.nonNull(books.getAuthor())
		            && !"".equalsIgnoreCase(books.getAuthor())) {
		            bookDB.setAuthor(books.getAuthor());
		        }
		 
		        if (Objects.nonNull(books.getPrice()) 
		        		&& !"".equalsIgnoreCase(books.getPrice())) {
		        	bookDB.setPrice(books.getPrice());
		        }
		return bookRepo.save(bookDB);
	}
	public void deleteById(int bookid) {
		bookRepo.deleteById(bookid);
	}
}
