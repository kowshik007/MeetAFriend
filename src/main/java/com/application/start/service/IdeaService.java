package com.application.start.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.start.bean.Idea;
import com.application.start.dao.IdeaDAO;
@Service
public class IdeaService {
	@Autowired
	private IdeaDAO ideadao;
	public List<Idea> getAllIdeas(){
		List<Idea> liIdea=new ArrayList<>();
		ideadao.findAll().forEach(liIdea::add);
		return liIdea;
	}
	public Optional<Idea> getIdeabyID(int id) {
		return ideadao.findById(id);
	}
	public Idea saveIdea(Idea i) {
		return ideadao.save(i);
	}
	public boolean deleteIdea(int id) {
		ideadao.deleteById(id);
		Optional<Idea> delIdea=ideadao.findById(id);
		if(delIdea.isPresent()) {
			return false;
		}else {
			return true;
		}
	}
}
