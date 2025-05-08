package com.labs.lab306ex1.repository;

import com.labs.lab306ex1.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByStatus(boolean status);
    List<Task> findByDueDateBefore(LocalDate date);
    List<Task> findByDueDateBetween(LocalDate startDate, LocalDate endDate);
}
