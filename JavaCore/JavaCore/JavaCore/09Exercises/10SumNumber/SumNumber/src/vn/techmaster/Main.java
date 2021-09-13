package vn.techmaster;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int number = rand.nextInt(50000);
        System.out.println("Tổng của số "+number+" là: " + sum(number));

    }

    static int sum(int number){
        int sum = 0;
        int n;
        while(number != 0){
            n = number % 10;
            sum += n;
            number/=10;
        }
        return sum;
    }
}
