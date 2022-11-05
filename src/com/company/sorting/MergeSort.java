package com.company.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        mergeSort(nums, nums.length);

        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, 3)));
    }

    public static void mergeSort(int[] arr, int length) {
        if (length < 2) {
            return;
        }

        int mid = length / 2;
        int[] leftArr = Arrays.copyOfRange(arr, 0, mid);
        int[] rightArr = Arrays.copyOfRange(arr, mid, length);

        mergeSort(leftArr, mid);
        mergeSort(rightArr, length - mid);

        merge(arr, leftArr, rightArr, mid, length - mid);


    }

    public static void merge(int[] arr, int[] leftArr, int[] rightArr, int leftLength, int rightLength) {

        int l = 0, r = 0, arrIndex = 0;

        while (l < leftLength && r < rightLength) {
            if (leftArr[l] <= rightArr[r]) {
                arr[arrIndex++] = leftArr[l++];
            } else {
                arr[arrIndex++] = rightArr[r++];
            }
        }

        while (l < leftLength) {
            arr[arrIndex++] = leftArr[l++];
        }

        while (r < rightLength) {
            arr[arrIndex++] = rightArr[r++];
        }

    }


}
