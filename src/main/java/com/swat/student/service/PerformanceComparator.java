package com.swat.student.service;

import com.swat.student.model.Student;
import org.springframework.stereotype.Component;

import java.util.Comparator;

@Component
public class PerformanceComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getPerformance() > o2.getPerformance()) {
            return 1;
        } else {
            return 0;
        }
    }
}
