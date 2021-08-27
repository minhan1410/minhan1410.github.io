import java.util.Stack;

class MyQueue {
    // 1 ms 38.6 MB
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> reverseStack = new Stack<Integer>();

    /** Initialize your data structure here. */
    public MyQueue() {
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(reverseStack.isEmpty()){
            while (!stack.isEmpty()) {
                reverseStack.push(stack.pop());
            }
        }
        return reverseStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (reverseStack.isEmpty()) {
            while (!stack.isEmpty()) {
                reverseStack.push(stack.pop());
            }
        }
        return reverseStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty() && reverseStack.isEmpty();
    }
}

public class Id232_Implement_Queue_using_Stacks {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.peek());  // return 1
        System.out.println(myQueue.pop());  // return 1, queue is [2]
        System.out.println(myQueue.empty());  // return false
    }
}
