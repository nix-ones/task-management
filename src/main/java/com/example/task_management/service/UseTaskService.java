package com.example.task_management.service;

import java.util.List;
import java.util.Optional;

import com.example.task_management.model.UseTask;

public interface UseTaskService {
	Optional<UseTask> findOne(Long id);
	List<UseTask> findAll();
	void save(UseTask useTask);
	void update(UseTask useTask);
	void delete(UseTask useTask);
	void delete(Long id);
}
