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

    private static int partition(int[] arr, int startIndex, int endIndex) {
       int pivot = arr[endIndex];
       int leftIndex = startIndex;

        // move to the left side
        for (int i = startIndex; i < endIndex; i++) {
            if (arr[i] <= pivot) {
                int temp = arr[leftIndex];
                arr[leftIndex] = arr[i];
                arr[i] = temp;
                leftIndex++;
            }
        }

        // got to the end

        // move pivot
        int temp = arr[leftIndex];
        arr[leftIndex] = pivot;
        arr[endIndex] = temp;
        return leftIndex;
    }
}
