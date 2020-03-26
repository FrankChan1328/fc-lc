package _232_myQueue;

public class MyQueue {
    Node tail;
    Node head;

    /** Initialize your data structure here. */
    public MyQueue() { }

    /** Push element x to the back of queue. */
    public void push(int x) {
        Node p = new Node(x);
        if (null == head) {
            head = p;
        }

        if (null == tail) {
            tail = p;
            head = p;
        } else {
            tail.next = p;
            tail = p;
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (null == head) {
            return -1;
        }
        if (head == tail) {
            tail = null;
        }

        int value = head.value;
        head = head.next;
        return value;
    }

    /** Get the front element. */
    public int peek() {
        if (null == head) {
            return -1;
        }
        return head.value;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return head == null;
    }
}
