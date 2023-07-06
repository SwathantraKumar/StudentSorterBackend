package com.swat.student.controller;

import com.swat.student.SortAlgorithm;
import com.swat.student.model.Student;
import com.swat.student.model.StudentSortResponse;
import com.swat.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping(value = "/api/students/sort")
    public ResponseEntity<StudentSortResponse> getStudentsPerformanceSorted(@RequestBody ArrayList<Student> students) {
        long start = System.currentTimeMillis();

        List<Student> sortedStudents = studentService.getStudentsPerformanceSorted(students, SortAlgorithm.BUBBLE);
        long end = System.currentTimeMillis();
        long bubbleSortPerformance = end - start;

        studentService.getStudentsPerformanceSorted(students, SortAlgorithm.MERGE);
        long end2  = System.currentTimeMillis();
        long mergeSortPerformance = end2 - end;

        studentService.getStudentsPerformanceSorted(students, SortAlgorithm.HEAP);
        long heapSortPerformance = System.currentTimeMillis() - end2;
        StudentSortResponse response = new StudentSortResponse();
        response.setBubbleSortPerformance(bubbleSortPerformance);
        response.setMergeSortPerformance(mergeSortPerformance);
        response.setHeapSortPerformance(heapSortPerformance);
        response.setSortedStudents(sortedStudents);

        return ResponseEntity.ok(response);
    }

}
