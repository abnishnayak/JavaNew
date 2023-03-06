package com.abnishn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abnishn.model.Books;
import com.abnishn.service.BookService;

@RestController
public class BookController {
	@Autowired 
	private BookService bookService;
	
	@PostMapping("/books")
	public Books saveBooks(@RequestBody Books books) {
		return bookService.saveBook(books);
	}
	
	@GetMapping("/books")
	public List<Books> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@PutMapping("/books/{id}")
	public Books updateBook(@RequestBody Books books, @PathVariable("id") int bookid) {
		return bookService.updateBook(books, bookid);
	}
	
	@DeleteMapping("/books/{id}")
	public String deleteBookById(@PathVariable("id") int bookid) {
		bookService.deleteById(bookid);
		return "Deleted Successfully";
	}
}
