package _155_minStack;

public class MinStackTest {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();
        System.out.println(minStack.getMin()); // ==> -3
        minStack.pop();
        minStack.top();
        System.out.println(minStack.top()); // 0
        minStack.getMin();
    }

}
