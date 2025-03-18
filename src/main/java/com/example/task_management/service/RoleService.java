package com.example.task_management.service;

import java.util.List;
import java.util.Optional;

import com.example.task_management.model.Role;



public interface RoleService {

	Optional<Role> findOne(Long id);
	List<Role> findAll();
	void save(Role role);
	void update(Role role);
	void delete(Role role);
	void delete(Long id);
}
