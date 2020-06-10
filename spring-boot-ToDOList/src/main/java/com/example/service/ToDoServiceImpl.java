package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ToDoDao;
import com.example.model.ToDo;

@Service("todoService")
public class ToDoServiceImpl implements ToDoService {
	private ToDoDao todoDao;
	
	
	
    public ToDoServiceImpl() {
		super();
	}

	@Autowired
	public ToDoServiceImpl(ToDoDao todoDao) {
		super();
		this.todoDao = todoDao;
	}

	@Override
	public List<ToDo> getToDos() {
		// TODO Auto-generated method stub
		return todoDao.getToDos();
	}

	@Override
	public void createToDo(ToDo todo) {
		// TODO Auto-generated method stub
		todoDao.createToDo(todo);
		
	}

	@Override
	public ToDo getTodo(int todoId) {
		// TODO Auto-generated method stub
		return todoDao.getTodo(todoId);
	}

	@Override
	public void delete(int todoId) {
		// TODO Auto-generated method stub
		todoDao.delete(todoId);
		
	}
	
	

}
