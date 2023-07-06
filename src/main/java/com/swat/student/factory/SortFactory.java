package com.swat.student.factory;

import com.swat.student.SortAlgorithm;
import com.swat.student.service.BubbleSorter;
import com.swat.student.service.HeapSorter;
import com.swat.student.service.ISorter;
import com.swat.student.service.MergeSorter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SortFactory {

    @Autowired
    BubbleSorter bubbleSorter;

    @Autowired
    MergeSorter mergeSorter;

    @Autowired
    HeapSorter heapSorter;

    public ISorter getSorter(SortAlgorithm algorithm) {
        switch (algorithm) {
            case BUBBLE:
                return bubbleSorter;
            case MERGE:
                return mergeSorter;
            default:
                return heapSorter;
        }
    }

}
