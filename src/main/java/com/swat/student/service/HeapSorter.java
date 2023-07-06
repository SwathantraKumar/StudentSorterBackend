package com.swat.student.service;

import org.springframework.stereotype.Service;

import java.util.Comparator;

@Service
public class HeapSorter implements ISorter {
    @Override
    public Object[] sort(Object[] array, Comparator comparator) {

        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i, comparator);
        }

        for (int i = n - 1; i >= 0; i--) {
            ISorter.swap(array, 0, i);
            heapify(array, i, 0, comparator);
        }

        return new Object[0];
    }

    private void heapify(Object[] array, int n, int i, Comparator comparator) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < n && comparator.compare(array[leftChild], array[largest]) == 0) {
            largest = leftChild;
        }

        if (rightChild < n && comparator.compare(array[leftChild], array[largest]) == 1) {
            largest = rightChild;
        }

        if (largest != i) {
            ISorter.swap(array, i, largest);
            heapify(array, n, largest, comparator);
        }
    }
}
