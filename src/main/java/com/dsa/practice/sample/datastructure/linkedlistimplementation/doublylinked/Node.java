package com.dsa.practice.sample.datastructure.linkedlistimplementation.doublylinked;

public class Node {
    int value;
    Node next;
    Node previous;

    public Node(int value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + (next != null? next.value : null)  +
                ", previous=" + (previous != null ? previous.value : null) +
                '}';
    }
}
