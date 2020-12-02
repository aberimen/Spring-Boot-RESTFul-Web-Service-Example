package com.aberimen.springboot.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aberimen.springboot.Model.Category;
import com.aberimen.springboot.Repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> getAll() {
		List<Category> categories = new ArrayList<Category>();
		
		repository.findAll().forEach(categories::add);
		
		return categories;
	}
	
	
	public void addCategory(Category category) {
		repository.save(category);
	}
	
	public void deleteCategory(int id) {
		System.out.println(id);
		repository.deleteById(id);
	}
	
	public void updateCategory(Category category) {
		repository.save(category);
	}

}
