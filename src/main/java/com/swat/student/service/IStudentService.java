package com.swat.student.service;

import com.swat.student.SortAlgorithm;
import com.swat.student.model.Student;

import java.util.ArrayList;
import java.util.List;

public interface IStudentService {

    List<Student> getStudentsPerformanceSorted(ArrayList<Student> students, SortAlgorithm sortAlgorithm);
}
