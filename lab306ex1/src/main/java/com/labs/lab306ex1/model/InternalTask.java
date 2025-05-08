package com.labs.lab306ex1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class InternalTask extends Task {

    public InternalTask() {
    }

    public InternalTask(String title, LocalDate dueDate) {
        super(title, dueDate);
    }
}
