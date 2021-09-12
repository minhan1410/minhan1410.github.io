// class MinStack {
//     // 1038 ms 47.2 MB
//     private Stack<Integer> stack;
//     /** initialize your data structure here. */
//     public MinStack() {
//         stack = new Stack<Integer>();
//     }

//     public void push(int val) {
//         stack.push(val);
//     }

//     public void pop() {
//         if(!stack.isEmpty()){
//             stack.pop();
//         }
//     }

//     public int top() {
//         if(!stack.isEmpty()){
//             return stack.peek();
//         }
//         return -1;
//     }

//     public int getMin() {
//         return stack.stream().min(Integer::compare).get().intValue();
//     }
// }

class MinStack {
    // 4 ms 40.4 MB
    class Node {
        int val, min;
        Node next;

        public Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

    Node head;

    /** initialize your data structure here. */
    public MinStack() {
    }

    public void push(int val) {
        if(head == null) {
            head = new Node(val, val ,null);
        }else{
            head = new Node(val, Math.min(val, head.min),head);
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
}

public class Id155_Min_Stack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top()); // return 0
        System.out.println(minStack.getMin()); // return -2
    }
}
