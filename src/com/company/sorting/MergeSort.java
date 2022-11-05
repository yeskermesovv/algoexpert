package com.company.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        mergeSort(nums, nums.length);

        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, 3)));
    }

    public static void mergeSort(int[] array, int length) {
        if (length < 2)
            return;

        int mid = length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, length);

        mergeSort(left, mid);
        mergeSort(right, length - mid);

        merge(array, left, right, mid, length - mid);
    }

    public static void merge(
            int[] arr, int[] leftArr, int[] rightArr, int leftArrLength, int rightArrLength) {

        int l = 0, r = 0, arrIndex = 0;
        while (l < leftArrLength && r < rightArrLength) { // check if both have remaining elements
            if (leftArr[l] <= rightArr[r]) {
                arr[arrIndex++] = leftArr[l++];
            } else {
                arr[arrIndex++] = rightArr[r++];
            }
        }

        // one part is out of bounds

        // copy remaining elements
        while (l < leftArrLength) {
            arr[arrIndex++] = leftArr[l++];
        }
        while (r < rightArrLength) {
            arr[arrIndex++] = rightArr[r++];
        }
    }


}
