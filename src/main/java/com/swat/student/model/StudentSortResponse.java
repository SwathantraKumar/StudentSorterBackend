package com.swat.student.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentSortResponse {
    private long mergeSortPerformance;
    private long bubbleSortPerformance;

    private long heapSortPerformance;

    private List<Student> sortedStudents;

    public long getMergeSortPerformance() {
        return mergeSortPerformance;
    }

    public void setMergeSortPerformance(long mergeSortPerformance) {
        this.mergeSortPerformance = mergeSortPerformance;
    }

    public long getBubbleSortPerformance() {
        return bubbleSortPerformance;
    }

    public void setBubbleSortPerformance(long bubbleSortPerformance) {
        this.bubbleSortPerformance = bubbleSortPerformance;
    }

    public List<Student> getSortedStudents() {
        return sortedStudents;
    }

    public void setSortedStudents(List<Student> sortedStudents) {
        this.sortedStudents = sortedStudents;
    }

    public long getHeapSortPerformance() {
        return heapSortPerformance;
    }

    public void setHeapSortPerformance(long heapSortPerformance) {
        this.heapSortPerformance = heapSortPerformance;
    }
}
