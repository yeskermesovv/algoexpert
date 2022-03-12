package com.company.binary_search;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        binarySearch(list, 2);
        binarySearch(list, 7);
        binarySearch(list, 3);


    }

    private static void binarySearch(List<Integer> list, int target) {

        int i = 0; // first index
        int j = list.size() - 1; // last index

        while (i <= j) {
            int mid = (i + j) / 2;
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

        System.out.println("Doesn't exist");
    }

    private static void guessGame() {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int low = 1; // inclusive
        int high = 101; // exclusive
        int target = r.nextInt(high - low) + low;
        int guess;

        do {
            System.out.println("Number is between 1 and 100. You have only 7 tries");
            guess = scanner.nextInt();
            if (target < guess) {
                System.out.println("Target is less");
            } else if (target > guess) {
                System.out.println("Target is more");
            }
        } while (guess != target);
        System.out.println("Yaaaay");
    }


}



















