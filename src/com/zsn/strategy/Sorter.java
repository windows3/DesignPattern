package com.zsn.strategy;

/**
 * @Author: zsn
 * @Date: 2020/5/4 15:31
 */
public class Sorter {
    public static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {

                minPos = arr[j] .compareTo( arr[minPos])==-1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

   static void swap(Comparable[] arr, int i, int j) {
        Comparable temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
