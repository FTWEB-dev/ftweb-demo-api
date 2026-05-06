package com.ftweb.pf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftweb.pf.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
