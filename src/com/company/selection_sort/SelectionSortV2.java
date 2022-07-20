package com.company.selection_sort;

import java.util.Arrays;

public class SelectionSortV2 {
    public static void main(String[] args) {
        int[] nums = {1,5,3,4};
        selectionSort(nums);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }

    private static int findSmallest(int[] nums, int startIndex) {
        int smallest = nums[startIndex];
        int smallestIndex = startIndex;

        for (int i = startIndex + 1; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    private static void swap(int[] nums, int first, int last) {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }

    private static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int smallest = findSmallest(nums, i);
            swap(nums, i, smallest);
        }
    }





}
