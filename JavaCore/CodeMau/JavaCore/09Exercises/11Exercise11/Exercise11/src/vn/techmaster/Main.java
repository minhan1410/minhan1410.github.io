package vn.techmaster;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println("Các thừa số nguyên tố của " + number + " là:");

        for (int i = 0; i <= number; i++){
            while (isPrime(i) && (number % i == 0)){
                System.out.printf("%d\t", i);
                number /= i;
            }
        }
    }

    static boolean isPrime(int number){
        if(number < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
