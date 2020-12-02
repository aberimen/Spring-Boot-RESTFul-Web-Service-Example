package com.aberimen.springboot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aberimen.springboot.Model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	
	List<Book> findByCategoryName(String categoryName);

}


