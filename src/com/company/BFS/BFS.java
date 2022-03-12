package com.company.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        // We need guys
        Vertex serik = new Vertex("Serik");
        Vertex marat = new Vertex("Marat");
        Vertex tore = new Vertex("Tore");
        Vertex kate = new Vertex("Kate");

        // Set neighborhood
        serik.neighbors.add(marat);
        serik.neighbors.add(tore);
        tore.neighbors.add(kate);

        // define iphoneseller
       // kate.setIphoneSeller(true);

        Queue<Vertex> queue = new LinkedList<>();
        List<Vertex> searched = new ArrayList<>();

        // Let the fun begin
        queue.add(serik);

        while(!queue.isEmpty()) {
            Vertex person = queue.poll();
            if (!searched.contains(person)) {
                if (person.isIphoneSeller()) {
                    System.out.println("Ladies and gentlemen, we got him. IphoneSeller: " + person.name);
                    return;
                }
                searched.add(person);
                queue.addAll(person.getNeighbors());
            }
        }
        System.out.println("No info found");
    }


}

class Vertex {
    String name;

    boolean isIphoneSeller = false;

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

    public List<Vertex> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Vertex> neighbors) {
        this.neighbors = neighbors;
    }

    public boolean isIphoneSeller() {
        return isIphoneSeller;
    }

    public void setIphoneSeller(boolean iphoneSeller) {
        isIphoneSeller = iphoneSeller;
    }

}