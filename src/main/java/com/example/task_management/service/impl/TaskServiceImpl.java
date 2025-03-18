package com.example.task_management.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task_management.model.Task;
import com.example.task_management.repository.TaskRepository;
import com.example.task_management.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService{

	@Autowired
	TaskRepository repository;

	@Override
	public Optional<Task> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<Task> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(Task task) {
		repository.save(task);
	}

	@Override
	public void update(Task task) {
		repository.save(task);
	}

	@Override
	public void delete(Task task) {
		repository.delete(task);
		
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}
}
