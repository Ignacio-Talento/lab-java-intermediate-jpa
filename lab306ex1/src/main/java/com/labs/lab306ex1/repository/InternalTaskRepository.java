package com.labs.lab306ex1.repository;

import com.labs.lab306ex1.model.InternalTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface InternalTaskRepository extends JpaRepository<InternalTask, Long> {

    // Find internal tasks by status
    List<InternalTask> findByStatus(boolean status);

    // Find internal tasks with due date after a specific date
    List<InternalTask> findByDueDateAfter(LocalDate date);
}
