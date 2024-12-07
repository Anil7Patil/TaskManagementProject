package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.TaskAssignment;
import com.example.demo.service.TaskAssignmentService;

import java.util.List;

@RestController
@RequestMapping("/task-assignments")
public class TaskAssignmentController {
    @Autowired
    private TaskAssignmentService taskAssignmentService;

    @GetMapping
    public List<TaskAssignment> getAllTaskAssignments() {
        return taskAssignmentService.getAllTaskAssignments();
    }

    @PostMapping
    public TaskAssignment createTaskAssignment(@RequestBody TaskAssignment taskAssignment) {
        return taskAssignmentService.createTaskAssignment(taskAssignment);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTaskAssignment(@PathVariable Integer id) {
        taskAssignmentService.deleteTaskAssignment(id);
        return ResponseEntity.noContent().build();
    }
}
