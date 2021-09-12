// class MyCircularQueue {
//     // 8 ms 45.1 MB
//     int[] arr;
//     int head, size, tail, count;

//     public MyCircularQueue(int k) {
//         arr = new int[k];
//         size = k;
//         head = tail = -1;
//     }

//     public boolean enQueue(int value) {
//         if (!isFull()) {
//             tail++;
//             if (tail == size) {
//                 tail = 0;
//             }else if(isEmpty()){
//                 head = tail;
//             }
//             arr[tail] = value;
//             count++;
//             return true;
//         }
//         return false;
//     }

//     public boolean deQueue() {
//         if (!isEmpty()) {
//             head++;
//             if (head == size) {
//                 head = 0;
//             }
//             count--;
//             return true;
//         }
//         return false;
//     }

//     public int Front() {
//         return isEmpty() ? -1 : arr[head];
//     }

//     public int Rear() {
//         return isEmpty() ? -1 : arr[tail];
//     }

//     public boolean isEmpty() {
//         return count == 0;
//     }

//     public boolean isFull() {
//         return count == size;
//     }
// }

class MyCircularQueue {
    // copy
    private int[] items;
    private int size = 0;
    private int head = -1;
    private int tail = -1;

    public MyCircularQueue(int k) {
        items = new int[k];
        size = k;
    }

    public boolean enQueue(int value) {
        if (!isFull()) {
            int newTail = (tail + 1) % size;
            if (newTail != head) {
                items[newTail] = value;
                tail = newTail;
                if (head == -1) {
                    head = tail;
                }
                return true;
            }
        }
        return false;
    }

    public boolean deQueue() {
        if (!isEmpty()) {
            if (head == tail) {
                head = -1;
                tail = -1;
                return true;
            }
            head = (head + 1) % size;
            return true;
        }
        return false;
    }

    public int Front() {
        if (!isEmpty()) {
            return items[head];
        }
        return -1;
    }

    public int Rear() {
        if (!isEmpty()) {
            return items[tail];
        }
        return -1;
    }

    public boolean isEmpty() {
        if (head == -1 && tail == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if ((tail + 1) % size == head) {
            return true;
        }
        return false;
    }
}

public class Id622_Design_Circular_Queue {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        System.out.println(myCircularQueue.enQueue(1)); // return True
        System.out.println(myCircularQueue.enQueue(2));// return True
        System.out.println(myCircularQueue.enQueue(3));// return True
        System.out.println(myCircularQueue.enQueue(4)); // return False
        System.out.println(myCircularQueue.Rear()); // return 3
        System.out.println(myCircularQueue.isFull()); // return True
        System.out.println(myCircularQueue.deQueue()); // return True
        System.out.println(myCircularQueue.enQueue(4)); // return True
        System.out.println(myCircularQueue.Rear()); // return 4
        System.out.println();

        // -----------------------------------------------------------------------------------

        MyCircularQueue myCircularQueue1 = new MyCircularQueue(2);

        System.out.println(myCircularQueue1.enQueue(1));
        System.out.println(myCircularQueue1.enQueue(2));

        System.out.println(myCircularQueue1.deQueue());
        System.out.println(myCircularQueue1.enQueue(3));

        System.out.println(myCircularQueue1.deQueue());
        System.out.println(myCircularQueue1.enQueue(3));

        System.out.println(myCircularQueue1.deQueue());
        System.out.println(myCircularQueue1.enQueue(3));

        System.out.println(myCircularQueue1.deQueue());
        System.out.println(myCircularQueue1.Front());
    }
}
