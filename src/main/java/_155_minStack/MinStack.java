package _155_minStack;

public class MinStack {
    Node head;

    public MinStack() { }

    /**
     * 每次加入的元素都放到头部
     */
    public void push(int x) {
        if (head == null) {
            Node node = new Node(x, x);
            head = node;
        } else {
            int min = Math.min(head.min, x);
            Node node = new Node(x, min);
            node.next = head;
            head = node;
        }
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public int top() {
        if (head != null) {
            return head.value;
        }
        return -1;
    }

    public int getMin() {
        if (head != null) {
            return head.min;
        }
        return -1;
    }
}
