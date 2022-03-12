package com.company.hashmap;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<Integer, String> hashmap = new java.util.HashMap<>();
        hashmap.put(0, "Serik");
        hashmap.put(1, "Tomi");
        hashmap.put(1, "Tore");
        hashmap.put(1, "Max");


        for (int i = 0; i < hashmap.size(); i++) {
            System.out.println(hashmap.get(i));
        }
    }
}
