package com.example.task_management.service;

import java.util.List;
import java.util.Optional;

import com.example.task_management.model.User;

public interface UserService {

	Optional<User> findOne(Long id);
	List<User> findAll();
	void save(User user);
	void update(User user);
	void delete(User user);
	void delete(Long id);
}
