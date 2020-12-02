package com.aberimen.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aberimen.springboot.Model.Book;
import com.aberimen.springboot.Service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;

	@RequestMapping("{category}/books")
	public List<Book> getAllBooks(@PathVariable String category){
		return bookService.getAllBooks(category);
	}
	
	@RequestMapping("/{category}/books/{id}")
	public Book getBook(@PathVariable int id){
		return bookService.getBook(id);
	}
	
	@RequestMapping(value = "/{category}/books", method = RequestMethod.POST)
	public void addBook(@RequestBody Book book) {
		bookService.addBook(book);
	}
	
	@RequestMapping(value = "/{category}/{id}", method = RequestMethod.DELETE)
	public void deleteBook(@PathVariable int id) {
		bookService.deleteBook(id);
	}
	
	@RequestMapping(value = "/{category}/books", method = RequestMethod.PUT)
	public void updateBook(@RequestBody Book book) {
		bookService.updateBook(book);
	}

}


