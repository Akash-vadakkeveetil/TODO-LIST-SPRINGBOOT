package com.example.TODO_LIST.repository;

import com.example.TODO_LIST.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
