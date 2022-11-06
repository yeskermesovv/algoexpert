package com.company.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};

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
        int pivot = arr[end]; // pivot is the right most element
        int leftIndex = begin;

        // move to the left side
        for (int i = begin; i < end; i++) { // ignore pivot
            if (arr[i] <= pivot) { // if less or equal to pivot
                int swapTemp = arr[leftIndex];
                arr[leftIndex] = arr[i];
                arr[i] = swapTemp;
                leftIndex++;
            }
        }

        // got to the end

        // move pivot
        int swapTemp = arr[leftIndex];
        arr[leftIndex] = arr[end];
        arr[end] = swapTemp;
        return leftIndex;
    }
}
