package com.ftweb.pf.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ftweb.pf.entity.Task;
import com.ftweb.pf.repository.TaskRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskService {

	private final TaskRepository taskRepository;
	
	public List<Task> findAll() {
		return taskRepository.findAll();
	}
	
	public Task findById(Long id) {
		return taskRepository.findById(id)
				.orElseThrow( () -> new RuntimeException("Task not found"));
	}
	
	public Task create(Task task) {
		return taskRepository.save(task);
	}
	
	public Task update(Long id, Task task) {
		Task existing = findById(id);
		existing.setTitle(task.getTitle());
		existing.setDescription(task.getDescription());
		existing.setCompleted(task.isCompleted());
		return taskRepository.save(existing);
	}
	
	public void delete(Long id) {
		taskRepository.deleteById(id);
	}
}
