package com.company.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        // we need guys
        Vertex serik = new Vertex("Serik");
        Vertex marat = new Vertex("Marat");
        Vertex tore = new Vertex("Tore");
        Vertex kate = new Vertex("Kate");

        // set neighbors
        serik.neighbors.add(marat);
        serik.neighbors.add(tore);
        marat.neighbors.add(kate);

        // set mango seller
        kate.setMangoSeller(true);

        // let the fun begin
        Queue<Vertex> queue = new LinkedList<>();
        List<Vertex> searched = new ArrayList<>();
        queue.add(serik);

        while (!queue.isEmpty()) {
            Vertex person = queue.poll();

            if (!searched.contains(person)) {
                if (person.isMangoSeller) {
                    System.out.println(person.name);
                    return;
                }
                queue.addAll(person.getNeighbors());
                searched.add(person);
            }
        }
    }
}

class Vertex {
    String name;
    boolean isMangoSeller = false;
    List<Vertex> neighbors = new ArrayList<>();

    public Vertex(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMangoSeller() {
        return isMangoSeller;
    }

    public void setMangoSeller(boolean mangoSeller) {
        isMangoSeller = mangoSeller;
    }

    public List<Vertex> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Vertex> neighbors) {
        this.neighbors = neighbors;
    }
}