package com.dsa.practice.sample.datastructure.linkedlistimplementation.doublylinked;


import java.util.Arrays;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList(10);
        linkedList.append(5);
        linkedList.append(16);
        linkedList.prepend(1);
        linkedList.insert(2, 99);
        //linkedList.remove(3);
        linkedList.printList();
        // 10 --> 5
System.out.println(linkedList);
        //1-->10-->5-->16
        //insert at 2
        //1-->10-->99-->5-->16
        // delete 3
        // 1--> 10-->99-->16
    }

    DoublyLinkedList(int value) {
        this.head = new Node(value);
        this.tail = this.head;
        this.length = 1;
    }

    void append(int value) {
        Node newNode = new Node(value);
        newNode.previous = this.tail;
        this.tail.next = newNode;
        this.tail = newNode;
        length++;
    }

    void prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head.previous=newNode;
        this.head = newNode;
        this.length++;
    }

    void insert(int index, int value) {

        if (index < 0 || index > length) {
            System.err.println("Index Out Of Bounds For Length " + length);
        } else if (index == 0){
            this.prepend(value);
        }else if (index >= this.length) {
            this.append(value);
        } else {
            Node node = this.head;
            // node = node.next;
            int i = 0;
            while (node != null) {

                if (i == (index - 1)) {
                    Node newNode = new Node(value);
                    newNode.previous = node;
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

    public void printList(){
        int[] array = new int [this.length];
        Node current = this.head;
        int i = 0;
        while (current != null){
            array[i]=current.value;
            i++;
            current = current.next;
        }
        System.out.println(Arrays.toString(array));
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
