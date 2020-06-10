package com.example.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.ToDo;

@Repository("todoDao")
public class ToDoDaoImpl implements ToDoDao {
	
	private final EntityManager entityManager;
	
    @Autowired
	public ToDoDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<ToDo> getToDos() {
		Query query=entityManager.createQuery("from ToDo");
		return query.getResultList();
	}

	@Override
	@Transactional
	public void createToDo(ToDo todo) {
		Session session=entityManager.unwrap(org.hibernate.Session.class);
		
		session.saveOrUpdate(todo);
		
		
	}

	@Override
	@Transactional
	public ToDo getTodo(int todoId) {
		
		return entityManager.find(ToDo.class, todoId);
	}

	@Override
	@Transactional
	public void delete(int todoId) {
		entityManager.remove(getTodo(todoId));
		
	}

}
