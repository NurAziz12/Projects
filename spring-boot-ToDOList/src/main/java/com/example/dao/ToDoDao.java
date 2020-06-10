package com.example.dao;

import java.util.List;

import com.example.model.ToDo;

public interface ToDoDao {

	public List<ToDo> getToDos();
	public void createToDo(ToDo todo);
	public ToDo getTodo(int todoId);
	public void delete (int todoId);
	
}
