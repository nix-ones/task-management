package com.example.task_management.service;

import java.util.List;
import java.util.Optional;

import com.example.task_management.model.State;

public interface StateService {

	Optional <State> findOne(Long id);
	List<State> findAll();
	void save(State state);
	void update(State state);
	void delete(State state);
	void delete(Long id);
}
