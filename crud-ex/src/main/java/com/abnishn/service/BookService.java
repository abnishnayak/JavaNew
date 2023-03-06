package com.abnishn.service;

import com.abnishn.model.Books;
import java.util.List;

public interface BookService {

	Books saveBook(Books books);
	
	List<Books> getAllBooks();
	 Books updateBook(Books books, int bookid);
	 
	 void deleteById(int bookid);
}
