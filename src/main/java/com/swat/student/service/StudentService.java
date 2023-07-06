package com.swat.student.service;

import com.swat.student.SortAlgorithm;
import com.swat.student.factory.SortFactory;
import com.swat.student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Service
public class StudentService implements  IStudentService {

    @Autowired
    SortFactory sortFactory;

    @Autowired
    BubbleSorter bubbleSorter;

    @Autowired
    MergeSorter mergeSorter;

    @Autowired
    PerformanceComparator performanceComparator;

    @Override
    public List<Student> getStudentsPerformanceSorted(ArrayList<Student> students, SortAlgorithm sortAlgorithm) {
       Object [] objArray = sortFactory.getSorter(sortAlgorithm).sort(students.toArray(), performanceComparator);
       List<Student> sortedStudents = new ArrayList<>();
       for(Object object: objArray) {
           if(object instanceof Student) {
               sortedStudents.add((Student) object);
           }
       }
       return sortedStudents;
    }
}
