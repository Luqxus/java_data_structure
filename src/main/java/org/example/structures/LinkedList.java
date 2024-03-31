package org.example.structures;

public class LinkedList<T> {
    ListNode<T> head;
    int height = 0;


    public void add(T data) {
        if (height == 0) {
            this.head = new ListNode<T>(data);
            height++;

            return;
        }

        ListNode<T> current  = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new ListNode<T>(data);
        height++;
    }

    public void print() {
        System.out.print("[");
        ListNode<T> current = head;
        for (int h = 0; h < height; h++) {
            System.out.printf(" %s ", current.data.toString());
            current = current.next;
        }

        System.out.println("]");
    }

    public int size() {
        return height;
    }
}

class ListNode<T> {
    T data;
    ListNode<T> next;

    ListNode(T data) {
        this.data = data;
    }
}
