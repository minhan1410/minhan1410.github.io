package vn.techmaster;

import java.util.Stack;

public class StackExample {
    public static void demoStack() {
        Stack<String> game= new Stack<>();

        // Add elements to Stack
        game.add("Left 4 dead");
        game.add("Mortal Combat");
        game.add("The witcher");
        game.add("Dark Souls");
        game.add("Horizon Zero Dawn");

        System.out.println("Stack: " + game);

        game.push("LOL"); //add element to stack

        System.out.println("Stack: " + game);

        // Remove element stacks
        String element = game.pop();
        System.out.println("Removed Element: " + element);

        System.out.println("After remove: \n" + game);

        // Access element from the top
        String elementTop = game.peek();
        System.out.println("Element at top: " + elementTop);

        // Search an element
        int position = game.search("Horizon Zero Dawn");
        System.out.println("Position of Mortal Combat: " + position);

        boolean result = game.empty();
        System.out.println("Stack empty? " + result);


    }
}
