package org.example;

import org.example.structures.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println(linkedList.size());

        linkedList.add(7);

        System.out.println(linkedList.size());
        linkedList.print();

        linkedList.add(9);
        linkedList.add(10);

        linkedList.print();

        System.out.println(linkedList.size());

    }
}