package com.labs.lab306ex1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class BillableTask extends Task {
    private double hourlyRate;

    public BillableTask() {
    }

    public BillableTask(String title, LocalDate dueDate, double hourlyRate) {
        super(title, dueDate);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
