package vn.techmaster;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeExample {
    public static void demoArrayDeque() {
        // Initializing an deque
        Deque<Integer> de_que = new ArrayDeque<Integer>(10);

        //deque -> double ended queue

        // add() method to insert
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);
        for (Integer element : de_que)
        {
            System.out.println("Element : " + element);
        }

        System.out.println("Using clear() ");

        // clear() method
        de_que.clear();

        // addFirst() method to insert at start
        de_que.addFirst(564);
        de_que.addFirst(291);

        // addLast() method to insert at end
        de_que.addLast(24);
        de_que.addLast(14);

        System.out.println("Above elements are removed now");

        // Iterator() :
        System.out.println("Elements of deque using Iterator :");
        for(Iterator itr = de_que.iterator(); itr.hasNext();)
        {
            System.out.println(itr.next());
        }

        // descendingIterator() : to reverse the deque order
        System.out.println("Elements of deque in reverse order :");
        for(Iterator dItr = de_que.descendingIterator();
            dItr.hasNext();)
        {
            System.out.println(dItr.next());
        }

        // element() method : to get Head element
        System.out.println("\nHead Element using element(): " +
                de_que.element());

        // getFirst() method : to get Head element
        System.out.println("Head Element using getFirst(): " +
                de_que.getFirst());


        // getLast() method : to get last element
        System.out.println("Last Element using getLast(): " +
                de_que.getLast());

        // toArray() method :
        Object[] arr = de_que.toArray();
        System.out.println("\nArray Size : " + arr.length);

        System.out.print("Array elements : ");
        for(int i=0; i<arr.length ; i++)
            System.out.print(" " + arr[i]);

        // peek() method : to get head
        System.out.println("\nHead element : " + de_que.peek());

        // poll() method : to get head
        System.out.println("Head element poll : " + de_que.poll());

        // push() method :
        de_que.push(265);
        de_que.push(984);
        de_que.push(2365);

        // remove() method : to get head
        System.out.println("Head element remove : " + de_que.remove());

        System.out.println("The final array is: "+de_que);


        // Initializing a deque
        // since deque is an interface
        // it is assigned the
        // ArrayDeque class
        Deque<String> dq = new ArrayDeque<String>();

        // add() method to insert
        dq.addFirst("To");
        dq.addLast("Techmaster");

        // offer() method to insert
        dq.offerFirst("Welcome");
        dq.offerLast("VietNam");

        // printing Elements of ArrayDeque to the console
        System.out.println("ArrayDeque : " + dq);
    }
}
