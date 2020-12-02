package com.aberimen.springboot.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aberimen.springboot.Model.Category;
import com.aberimen.springboot.Service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	CategoryService service;

	@RequestMapping("/")
	public List<Category> getAll(){
		return service.getAll();
	}
	

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void addCategory(@RequestBody Category category) {
		service.addCategory(category);
	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public void updateCategory(@RequestBody Category category) {
		service.updateCategory(category);
	}

}
