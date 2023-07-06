package com.swat.student.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;

@Service
public class MergeSorter implements ISorter{


    public Object[] sort(Object[] array, Comparator comparator) {
        if(array.length == 1) {
            return array;
        }
        int mid = array.length/2;
        Object[] left = sort(Arrays.copyOfRange(array, 0, mid), comparator);
        Object[] right = sort(Arrays.copyOfRange(array, mid, array.length), comparator);

        return merge(left, right, comparator);
    }

    private Object[] merge(Object[] left, Object[] right, Comparator comparator) {
        Object[] merged = new Object[left.length+right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if(comparator.compare(left[i], right[j]) == 0) {
                merged[k] = left[i];
                i++;
            } else {
                merged[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            merged[k] = left[i];
            i++; k++;
        }

        while (j < right.length) {
            merged[k] = right[j];
            j++; k++;
        }

        return merged;
    }
}
