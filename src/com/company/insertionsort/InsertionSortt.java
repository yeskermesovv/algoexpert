package com.company.insertionsort;

import java.util.Arrays;

public class InsertionSortt {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        insertionSort(nums);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }


    private static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;

            // move it
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key;
        }
    }

}

