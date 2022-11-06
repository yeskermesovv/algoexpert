package com.company.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {2, 1};

        quickSort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int pivotIndex = partition(arr, begin, end);

            quickSort(arr, begin, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = begin;

        for (int j = begin; j < end; j++) { // ignore pivot
            if (arr[j] <= pivot) { // if less or equal to pivot
                int swapTemp = arr[i];
                arr[i] = arr[j];
                System.out.println("arr = " + i);
                arr[j] = swapTemp;
                System.out.println("swapTemp = " + j);
                i++;
            }
        }

        // got to the end

        // swap pivot
        int swapTemp = arr[i];
        arr[i] = arr[end];
        arr[end] = swapTemp;

        System.out.println("i = " + i);
        System.out.println("end = " + end);

        return i;
    }
}
