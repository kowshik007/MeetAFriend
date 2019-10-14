package com.application.start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.application.start.bean.Category;
import com.application.start.service.CategoryService;
@RestController
public class CategoryRestController {
	@Autowired
	private CategoryService categoryService;
	@GetMapping("/categories/{name}")
	public List<Category> findCategoryByName(@PathVariable(value = "name") String name){
		return categoryService.findCategoriesByName(name);
	}
}
