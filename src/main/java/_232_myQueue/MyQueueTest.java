package _232_myQueue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(1);
        System.out.println(queue.pop()); // 返回 1
        queue.push(2);
        System.out.println(queue.peek()); // 返回 2
    }
}
