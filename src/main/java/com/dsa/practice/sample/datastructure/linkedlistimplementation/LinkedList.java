package com.dsa.practice.sample.datastructure.linkedlistimplementation;

import ch.qos.logback.classic.encoder.JsonEncoder;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(10);
        linkedList.append(5);
        linkedList.append(16);
        linkedList.prepend(1);
        linkedList.insert(2, 99);
        linkedList.remove(3);
        System.out.println(linkedList);
        linkedList.reverse(linkedList);

        //1-->10-->5-->16
        //insert at 2
        //1-->10-->99-->5-->16
        // delete 3
        // 1--> 10-->99-->16
    }

    LinkedList(int value) {
        this.head = new Node(value);
        this.tail = this.head;
        this.length = 1;
    }

    void append(int value) {
        Node newNode = new Node(value);
        this.tail.next = newNode;
        this.tail = newNode;
        this.length = this.length + 1;
    }

    void prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = this.head;
        //this.head.next = this.head;
        this.head = newNode;
        this.length++;
    }

    void insert(int index, int value) {

        if (index >= this.length) {
            this.append(value);
        } else {
            Node node = this.head;
            // node = node.next;
            int i = 0;
            while (node != null) {

                if (i == (index - 1)) {
                    Node newNode = new Node(value);
                    newNode.next = node.next;
                    node.next = newNode;
                    this.length++;
                    break;

                } else {
                    node = node.next;
                    i++;
                }

            }
        }
    }

    public void remove(int index) {


        Node node = this.head;
        // node = node.next;
        int i = 0;
        while (node != null) {

            if (i == (index - 1)) {
                Node nextToNextNode = node.next.next;
                node.next = nextToNextNode;
                this.length--;
                break;

            } else {
                node = node.next;
                i++;
            }

        }


    }

    public void reverse (LinkedList linkedList) {
        if( this.head.next == null ){
            System.out.println(head);
        }else{
            Node first = this.head;
            Node second = this.head.next;
            while (second != null){
                Node temp = second.next;
                second.next = first;
                first = second;
                second = temp;
            }

        }

    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }
}
