package com.swat.student.service;

import java.util.Comparator;

public interface ISorter {

    Object[] sort(Object[] array, Comparator comparator);

    static Object[] swap(Object[] array, int index1, int index2) {
        Object temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }
}
