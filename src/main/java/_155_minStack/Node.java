package _155_minStack;

public class Node {
    int value;
    int min;
    Node next;

    Node(int x, int min) {
        this.value = x;
        this.min = min;
        next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
