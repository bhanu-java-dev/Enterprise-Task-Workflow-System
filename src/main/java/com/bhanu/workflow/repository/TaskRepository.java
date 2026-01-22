package com.bhanu.workflow.repository;

import com.bhanu.workflow.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // You can add custom queries later if needed
}
