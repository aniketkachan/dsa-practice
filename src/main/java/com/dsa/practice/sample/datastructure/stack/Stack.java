package com.dsa.practice.sample.datastructure.stack;

public class Stack {

    Node top;
    Node bottom;
    int length = 0;
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.peek());;
        stack.push("Google");
        stack.push("Udemy");
        stack.push("Discord");
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);


        //Discord
        //Udemy
        //Google
    }

    public Stack() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    public String peek(){
        if (this.length==0){
            return null;
        }else{
            return this.top.toString();
        }
    }

    public void pop(){
        if(this.length==1){
            this.top = null;
            this.bottom = null;
        }else{
            Node tempNode = this.top;
            this.top = this.top.next;
        }
        this.length --;
    }
    public void push (String value){
        Node newNode = new Node(value);
        if (this.length==0){
            this.top = newNode;
            this.bottom = newNode;
        }else{
            Node tempNode = this.top;
            this.top = newNode;
            this.top.next = tempNode;

        }
        this.length ++;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                ", bottom=" + bottom +
                ", length=" + length +
                '}';
    }
}
