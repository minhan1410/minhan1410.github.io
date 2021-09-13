package vn.techmaster;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void demoPriorityQueue() {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(30);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(10);
        pQueue.add(35);

        System.out.println(pQueue);

        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());

        System.out.println(pQueue);

        //With String

        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Python");
        pq.add("Java");
        pq.add("Python");
        pq.add("HTML");
        pq.add("Ruby");
        pq.add("C/C++");

        System.out.println(pq);

        //pq.remove("Python");

        //System.out.println("After Remove - " + pq);

        System.out.println("Poll Method - " + pq.poll());

        System.out.println("Final PriorityQueue - " + pq);

        // Using the peek() method
        String element = pq.peek();
        System.out.println("Accessed Element: " + element);

        Iterator iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}
