package com.application.start.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.start.bean.Category;
import com.application.start.dao.CategoryDAO;

@Service
public class CategoryService {
	@Autowired
	private CategoryDAO categoryDAO;
	public List<Category> getAllCategories(){
		List<Category> liCategory=new ArrayList<Category>();
		categoryDAO.findAll().forEach(liCategory::add);
		return liCategory;
	}
	public List<Category> findCategoriesByName(String searchName){
		return categoryDAO.findByName(searchName);
	}
}
