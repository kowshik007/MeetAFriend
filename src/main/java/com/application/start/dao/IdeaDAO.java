package com.application.start.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.application.start.bean.Idea;
@Repository
public interface IdeaDAO extends CrudRepository<Idea,Integer> {
	
}
