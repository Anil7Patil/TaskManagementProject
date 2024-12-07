package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.TaskAssignment;

public interface TaskAssignmentRepository extends JpaRepository<TaskAssignment, Integer> {
}
