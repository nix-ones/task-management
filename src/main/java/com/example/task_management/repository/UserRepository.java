package com.example.task_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.task_management.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
