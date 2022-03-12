package com.company.selection_sort;

import java.util.ArrayList;
import java.util.List;

// O(n^2)
public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-48);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(-456645);

        System.out.println(selectionSort(list));
    }

    private static int findSmallest(List<Integer> list) {
        int smallest = list.get(0);
        int smallest_index = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
                smallest_index = i;
            }
        }

        return smallest_index;
    }

    private static List<Integer> selectionSort(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        int size = list.size();

        for (int i = 0; i < size; i++) {
            int smallest = findSmallest(list);
            newList.add(list.remove(smallest));
        }

        return newList;
    }


}

