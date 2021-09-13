package vn.techmaster;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void demoSortedSet() {
        SortedSet<String> ts = new TreeSet<String>();

        // Elements are added using add() method
        ts.add("Nam Từ Liêm");
        ts.add("Bắc Từ Liêm");
        ts.add("Cầu Giấy");
        ts.add("Hai Bà Trưng");
        ts.add("Thanh Xuân");
        ts.add("Hoàn Kiếm");


        System.out.println("Initial TreeSet " + ts);

        // Print the first element in the SortedSet
        System.out.println("First Value " + ts.first());

        // Print the last element in the SortedSet
        System.out.println("Last Value " + ts.last());
        // Check if the above string exists in the SortedSet or not
        System.out.println("Contains Đống Đa  "  + ts.contains("Đống Đa"));

        System.out.println(ts.add("Nam Từ Liêm")); // Adding the duplicate element

        // Removing the element b
        ts.remove("Cầu Giấy");

        System.out.println("After removing element " + ts);
    }
}
