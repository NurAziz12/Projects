package com.example.controller;


import com.example.model.ToDo;
import com.example.service.ToDoService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/todo")
public class ToDoController  {

	private ToDoService service;

	public ToDoController(ToDoService service) {
		super();
		this.service = service;
	}
	@RequestMapping("/listToDo")
    public String listToDo(Model model) {
		model.addAttribute("todos",  service.getToDos());
		return "todo-list";
	}
	@RequestMapping("/showFormForAdd")

	public String showFormForAdd(Model model) {
		model.addAttribute("toDo", new ToDo());
		return "todo-form";
	}
	@RequestMapping("/saveToDo")
	public String saveToDo(@ModelAttribute("toDo") ToDo toDo) {
		 service.createToDo(toDo);
		 return "redirect:/todo/listToDo";
	}
	
	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("todoId") int theId, Model theModel) {
		ToDo theToDo=service.getTodo(theId);
		theModel.addAttribute("toDo",theToDo);
		return "todo-form";
	}
	@RequestMapping("/updateToDo")
	public String updateToDo(@ModelAttribute("todo") ToDo todo) {
		service.createToDo(todo);
		return "redirect:/todo/listToDo";
		
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam("todoId") int todoId) {
		service.delete(todoId);
		return"redirect:/todo/listToDo";
		
	}
}
