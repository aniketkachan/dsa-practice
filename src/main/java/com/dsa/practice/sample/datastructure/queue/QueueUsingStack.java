package com.dsa.practice.sample.datastructure.queue;

import java.util.Queue;
import java.util.Stack;

public class QueueUsingStack {


/**
 * => we will use the inbuilt stack that comes in java.<br/>
 * => You can also use the stack that we built in stacks section<br/>
 * => both of the above approach would work fine with very minute modifications.
 */

    // this is the main stack which we will use as queue
    Stack<Integer> queueStack = new Stack<>();
    // rev stack
    Stack<Integer> revStack = new Stack<>();

    public void push(int x) {
        if (this.queueStack.size() == 0) {
            this.queueStack.push(x);
        } else {
            System.out.println(this.queueStack);
            System.out.println(this.revStack);
            System.out.println("---");

            while (this.queueStack.size() != 0) {
                this.revStack.push(this.queueStack.pop());
            }
            this.revStack.push(x);
            System.out.println(this.queueStack);
            System.out.println(this.revStack);
            System.out.println("---");
            while (this.revStack.size() != 0) {
                this.queueStack.push(this.revStack.pop());
            }
            System.out.println(this.queueStack);
            System.out.println(this.revStack);
            System.out.println("---");
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public Integer pop() {
        if (this.queueStack.size() > 0) {
            return this.queueStack.pop();
        } else {
            return null;
        }

    }

    /**
     * Get the front element.
     */
    public Integer peek() {
        if (this.queueStack.size() > 0) {
            return this.queueStack.get(this.queueStack.size() - 1);
        } else {
            return null;
        }
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return this.queueStack.size() == 0;
    }

    public static void main(String[] args) {
        QueueUsingStack myQueue = new QueueUsingStack();
        myQueue.push(10);
        myQueue.push(20);
        //System.out.println(myQueue.queueStack);
        //System.out.println(myQueue.revStack);
        myQueue.push(30);
        //System.out.println(myQueue.queueStack);
        System.out.println("---");

        // the last element in the queueStack will be our first item of queue.
        System.out.println("queue: "+myQueue.queueStack);
        System.out.println("peek: "+myQueue.peek());
        System.out.println("pop: "+myQueue.pop());
        System.out.println("queue: "+myQueue.queueStack);
        System.out.println("peek: "+myQueue.peek());
        System.out.println("is queue empty: "+myQueue.empty());
    }
}
