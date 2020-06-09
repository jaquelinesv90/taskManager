package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Task;
import com.repository.TaskRepository;

@Controller
@RequestMapping("/tasks")
public class TaskController {
	  
	@Autowired
	private TaskRepository repository;
	
	@RequestMapping
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView("TaskList");
		
		mv.addObject("tasks", repository.findAll());
		mv.addObject(new Task());
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvar(Task task) {
		this.repository.save(task);
		return "redirect:/tasks";
	}
	
}
