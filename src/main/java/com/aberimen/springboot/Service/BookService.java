package com.aberimen.springboot.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aberimen.springboot.Model.Book;
import com.aberimen.springboot.Repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository repository;
	
	public List<Book> getAllBooks(String categoryName){
		 List<Book> books = new ArrayList<Book>();
		 repository.findByCategoryName(categoryName).forEach(books::add);
		 
		 return books;
	}
	
	public Book getBook(int id) {
		return repository.findById(id).get();
	}
	
	public void addBook(Book book) {
		repository.save(book);
	}
	
	public void deleteBook(int id) {
		System.out.println(id);
		repository.deleteById(id);
	}
	
	public void updateBook(Book book) {
		repository.save(book);
	}
	
}
