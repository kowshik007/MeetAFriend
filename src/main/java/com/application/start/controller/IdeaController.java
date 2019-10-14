package com.application.start.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.application.start.bean.Idea;
import com.application.start.service.IdeaService;
@Controller
public class IdeaController {
	@Autowired
	private IdeaService ideaService;
	@GetMapping("/Ideas")
	public String getAllIdeas(Model model) {
		model.addAttribute("ideas", ideaService.getAllIdeas());
		return "Idea";
	}
	@GetMapping("/NewIdea")
	public String getNewIdea(Model model) {
		model.addAttribute("idea", new Idea());
		return "NewIdea";
	}
	@PostMapping("/NewIdea")
	public String createNewIdea(@Valid Idea idea, Errors errors) {
		if (errors.hasErrors()) {
		      return "NewIdea";
		}
		return "redirect:/Idea";
	}
}
