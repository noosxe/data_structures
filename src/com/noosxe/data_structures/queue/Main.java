package com.noosxe.data_structures.queue;

public class Main {

    public static void main(String[] args) {
	    Queue q = new Queue(5);
	    q.enqueue(1);
	    q.enqueue(2);
	    q.enqueue(3);
	    q.enqueue(4);
	    q.enqueue(5);
	    System.out.println(q.dequeue());
	    q.enqueue(6);
		System.out.println(q.dequeue());
		q.enqueue(7);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
    }
}
