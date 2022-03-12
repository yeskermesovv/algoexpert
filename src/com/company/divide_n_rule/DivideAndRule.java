package com.company.divide_n_rule;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DivideAndRule {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(counter(list));
    }

    private static int findSum(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        } else {
            return list.remove(0) + findSum(list);
        }
    }

    private static int counter(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        } else {
            list.remove(0);
            return 1 + counter(list);
        }
    }

    private static int findMax(List<Integer> list) {
        if (list.size() == 1) {
            return list.get(0);
        } else {
            if (list.get(0) < list.get(1)) {
                list.remove(0);
            } else {
                list.remove(1);
            }
            return findMax(list);
        }
    }

   private static List<Integer> qsort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        } else {
            int pivot = list.get(0);
            List<Integer> left = new ArrayList<>();
            List<Integer> right = new ArrayList<>();

            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) < pivot) {
                    left.add(list.get(i));
                } else if (list.get(i) > pivot) {
                    right.add(list.get(i));
                }
            }

            List<Integer> res = new ArrayList<>();
            res.addAll(qsort(left));
            res.add(pivot);
            res.addAll(qsort(right));

            return res;
        }

   }
}
