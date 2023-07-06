package com.swat.student.service;

import org.springframework.stereotype.Service;

import java.util.Comparator;

@Service
public class BubbleSorter implements ISorter{

    @Override
    public Object[] sort(Object[] array, Comparator comparator) {
        boolean swapped = false;
        for(int i=0; i < array.length; i++) {
            for(int j=1; j < array.length - i; j++) {
             if(comparator.compare(array[j], array[j-1]) == 0) {
                 ISorter.swap(array, j, j-1);
                 swapped = true;
              }
            }
            if(!swapped) {
                break;
            }
        }
        return array;
    }
}
