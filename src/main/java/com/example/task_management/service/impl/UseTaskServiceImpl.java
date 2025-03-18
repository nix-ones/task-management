package com.example.task_management.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task_management.model.UseTask;
import com.example.task_management.repository.UseTaskRepository;
import com.example.task_management.service.UseTaskService;

@Service
public class UseTaskServiceImpl implements UseTaskService{

	@Autowired
	UseTaskRepository repository;
	
	@Override
	public Optional<UseTask> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<UseTask> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(UseTask useTask) {
		repository.save(useTask);
	}

	@Override
	public void update(UseTask useTask) {
		repository.save(useTask);
	}

	@Override
	public void delete(UseTask useTask) {
		repository.delete(useTask);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

	
}
