package com.example.test_1.repository;

import com.example.test_1.domain.Task;
import com.example.test_1.domain.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositiryTask extends JpaRepository<Task, Long> {
     List<Task> findByStatus(TaskStatus taskStatus);
}
