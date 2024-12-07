package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TaskAssignment;
import com.example.demo.repository.TaskAssignmentRepository;

import java.util.List;

@Service
public class TaskAssignmentService {
    @Autowired
    private TaskAssignmentRepository taskAssignmentRepository;

    public List<TaskAssignment> getAllTaskAssignments() {
        return taskAssignmentRepository.findAll();
    }

    public TaskAssignment createTaskAssignment(TaskAssignment taskAssignment) {
        return taskAssignmentRepository.save(taskAssignment);
    }

    public void deleteTaskAssignment(Integer id) {
        taskAssignmentRepository.deleteById(id);
    }
}
