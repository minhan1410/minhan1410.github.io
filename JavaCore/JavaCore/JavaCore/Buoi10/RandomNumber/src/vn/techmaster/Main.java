package vn.techmaster;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int number = 0;
        while(number <= 90){
            number = rand.nextInt(100);
            System.out.println(number);
        }

//        for (int i = 0; number <= 90; i++){
//            number = rand.nextInt(100);
//            System.out.println(number);
//        }
    }
}
