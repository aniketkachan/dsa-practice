package com.dsa.practice.sample.datastructure.queue;

public class QueueUsingLinkedList {

    Node first;
    Node last;
    int length;

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue("Sagar");
        System.out.println("enqueue : "+queue);
        System.out.println(queue.peek());
        queue.enqueue("Ajay");
        System.out.println("enqueue : "+queue);
        queue.enqueue("Bala");
        System.out.println("enqueue : "+queue);
        queue.dequeue();
        System.out.println("enqueue : "+queue);


        //Sagar
        //Ajay
        //Bala
        //Chandan


    }

    public QueueUsingLinkedList() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public String peek(){

        if (this.length > 0){
            return this.last.toString();
        }
        return "";
    }

    public void enqueue(String value) {
        Node newNode = new Node(value);
        if (this.length == 0){
            this.first = newNode;
            this.last = newNode;
        }else{
            this.last.next = newNode;
            this.last = newNode;
        }
        this.length++;
    }
    public void dequeue(){
        if (this.length == 0){
            return;
        }else if (this.length == 1){
            this.last = null;
        }
        this.first = this.first.next;
        this.length--;
    }

    @Override
    public String toString() {
        return "QueueUsingLinkedList{" +
                "first=" + first +
                ", last=" + last +
                ", length=" + length +
                '}';
    }
}
