package vn.techmaster;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void demoLinkedHashSet() {
        LinkedHashSet<String> linkedset =
                new LinkedHashSet<String>();

        // Adding element to LinkedHashSet
        linkedset.add("Naruto");
        linkedset.add("Saitama");
        linkedset.add("Luffy");
        linkedset.add("Kakashi");

        System.out.println("List character in anime: ");
        System.out.println(linkedset);
        // This will not add new element as Luffy already exists
        linkedset.add("Luffy");
        linkedset.add("Kirito");

        System.out.println("Size of LinkedHashSet = " +
                linkedset.size());
        System.out.println("Original LinkedHashSet:" + linkedset);
        System.out.println("Removing Kakashi from LinkedHashSet: " +
                linkedset.remove("Kakashi"));
        System.out.println("Trying to Remove Asuna which is not "+
                "present: " + linkedset.remove("Asuna"));
        System.out.println("Checking if Naruto is present=" +
                linkedset.contains("Naruto"));
        System.out.println("Updated LinkedHashSet: " + linkedset);

        // Iterating though the LinkedHashSet
        Iterator itr = linkedset.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + ", ");
        System.out.println();

        // Using for each
        for (String s : linkedset)
            System.out.print(s + ", ");
        System.out.println();
    }

}
