package com.noosxe.data_structures.queue;

class Queue {
    private int[] data;
    private int head;
    private int tail;
    private boolean isFull;
    private boolean isEmpty;

    Queue(int size) {
        data = new int[size];
    }

    void enqueue(int item) {
        if (isFull) {
            throw new RuntimeException("Queue overflow");
        }

        data[tail] = item;

        if (tail == data.length - 1) {
            tail = 0;
        } else {
            tail++;
        }

        isEmpty = false;

        if (head == tail) {
            isFull = true;
        }
    }

    int dequeue() {
        if (isEmpty) {
            throw new RuntimeException("Queue underflow");
        }

        int item = data[head];

        if (head == data.length - 1) {
            head = 0;
        } else {
            head++;
        }

        isFull = false;

        if (head == tail) {
            isEmpty = true;
        }

        return item;
    }
}
