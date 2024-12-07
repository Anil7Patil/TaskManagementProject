package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name="users")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	// @Column(nullable = false, unique = true)
	    private String username;
	
	//@Column(nullable = false,unique = true)
	private String email;
	
	//@Column(nullable = false)
	private String password;
	
	@Column(name="created_at", updatable = false)
	private LocalDateTime createdAt;
	
	@OneToMany(mappedBy  ="user")
	private Set<TaskAssignment> taskAssignments;
	
	@PrePersist
	protected void onCreate()
	{
		createdAt=LocalDateTime.now();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public Set<TaskAssignment> getTaskAssignments() {
		return taskAssignments;
	}

	public void setTaskAssignments(Set<TaskAssignment> taskAssignments) {
		this.taskAssignments = taskAssignments;
	}
	
	
	
	
	
}
