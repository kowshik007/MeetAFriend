package com.application.start.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.application.start.bean.Category;
@Repository
public interface CategoryDAO extends CrudRepository<Category,Integer> {
	List<Category> findByName(String name);
}
