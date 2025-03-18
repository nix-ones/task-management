package com.example.task_management.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.task_management.model.UseTask;

public interface UseTaskRepository extends JpaRepository<UseTask, Long> {

}
