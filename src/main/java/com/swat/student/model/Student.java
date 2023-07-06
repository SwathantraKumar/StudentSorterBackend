package com.swat.student.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private double performance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerformance() {
        return performance;
    }

    public void setPerformance(double performance) {
        this.performance = performance;
    }
}
