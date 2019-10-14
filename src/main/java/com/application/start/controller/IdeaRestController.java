package com.application.start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.start.bean.Idea;
import com.application.start.service.IdeaService;
@RestController
public class IdeaRestController {
	@Autowired
	private IdeaService ideaService;
	@GetMapping("/Ideas_API")
	public List<Idea> getAllIdeas(){
		return ideaService.getAllIdeas();
	}
	@PutMapping("/Ideas_API/{id}")
	public Idea saveIdea(@RequestBody Idea i,@PathVariable int id) {
		return ideaService.saveIdea(i);
	}
	@PostMapping("/Ideas_API")
	public Idea createIdea(@RequestBody Idea i) {
		return ideaService.saveIdea(i);
	}
}
