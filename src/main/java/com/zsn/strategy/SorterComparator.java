package com.zsn.strategy;

/**
 * @Author: zsn
 * @Date: 2020/5/4 15:31
 */
public class SorterComparator<T> {
    public  void sort(T[] arr,Comparator<T> comparator) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {

                minPos = comparator.compareTo(arr[i],arr[j])==-1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    void swap(T[] arr, int i, int j) {
        T temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
