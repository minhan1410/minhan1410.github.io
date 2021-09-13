package vn.techmaster;

import java.util.ArrayList;
import java.util.LinkedList;

public class Efficiency {
    public static void checkEfficiency(){
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long start, end, timeElapsed;
        start = System.nanoTime();
        arrayList.add("Java");
        arrayList.add("HTML/CSS");
        arrayList.add("Python");
        for(String s : arrayList){
            System.out.println(s);
        }
        end = System.nanoTime();
        timeElapsed = end - start;

        System.out.println("Sử dụng arraylist: "+ timeElapsed);

        start = System.nanoTime();
        linkedList.add("Java");
        linkedList.add("HTML/CSS");
        linkedList.add("Python");
        for(String s : linkedList){
            System.out.println(s);
        }
        end = System.nanoTime();
        timeElapsed = end - start;


        System.out.println("Sử dụng Linkedlist: "+timeElapsed);
    }
}
