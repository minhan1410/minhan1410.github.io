package vn.techmaster;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void demoHashSet() {
        HashSet<String> h = new HashSet<String>();

        // Adding elements into HashSet usind add()
        h.add("Viet Nam");
        h.add("India");
        h.add("China");
        h.add("American");
        h.add("Australia");
        h.add("South Africa");
        h.add("India"); // adding duplicate elements

        System.out.println(h);

        h.add("A");
        h.add("E");
        h.add("Mexico");

        // Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains India or not:"
                + h.contains("India"));

        // Removing items from HashSet using remove()
        h.remove("Australia");
        System.out.println("List after removing Australia:"
                + h);

        // Returns false if the element is not present
        System.out.println("Element Japan exists in the Set : "
                + h.remove("Japan"));

        // Iterating over hash set items
        System.out.println("\nIterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.print(i.next() + ", ");

        // Using for each
        System.out.println("\nUsing for each:");
        for (String s : h){
            System.out.print(s + ", ");
        }

    }
}
