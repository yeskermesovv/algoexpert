package com.company.binary_search;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        binarySearch(list, 2);
        binarySearch(list, 3);
        binarySearch(list, 5);
    }

    private static void binarySearch(List<Integer> list, int target) {

        int i = 0; // first index
        int j = list.size() - 1; // last index

        while (i <= j) {
            int mid = i + (j - i) / 2;
            int guess = list.get(mid);

            if (guess == target) {
                System.out.println(guess);
                return;
            } else if (target < guess) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        System.out.println("doesn't exist");


    }

























}