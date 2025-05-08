package com.labs.lab306ex1.repository;

import com.labs.lab306ex1.model.BillableTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillableTaskRepository extends JpaRepository<BillableTask, Long> {

    // Find billable tasks with hourly rate greater than specified amount
    List<BillableTask> findByHourlyRateGreaterThan(double rate);

    // Find billable tasks with hourly rate between two values
    List<BillableTask> findByHourlyRateBetween(double minRate, double maxRate);

    // Find billable tasks that are completed (status = true)
    List<BillableTask> findByStatus(boolean status);
}
