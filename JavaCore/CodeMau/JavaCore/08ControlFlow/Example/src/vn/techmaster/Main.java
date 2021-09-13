package vn.techmaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        //m.usingForLoop();
        //m.usingWhileLoop();
        PrimeNumber primeNumber = new PrimeNumber();
        long start = System.nanoTime();
        if (primeNumber.isPrimeUsingWhileLoop(7)){
            System.out.println("7 là số nguyên tố");
        }else{
            System.out.println("7 không là số nguyên tố");
        }
       // m.usingForLoop();
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println("Cách 1: "+timeElapsed);


        start = System.nanoTime();
        if (primeNumber.isPrimeUsingForLoop(7)){
            System.out.println("7 là số nguyên tố");
        }else{
            System.out.println("7 không là số nguyên tố");
        }
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("Cách 2: "+timeElapsed);
    }

    public void usingForLoop() {
        for (int i = 0; i < 10; i++){ //Xác định rõ số lần lặp là 10
            System.out.println("Xin chào các bạn!!!");
        }
    }



    public void usingWhileLoop() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        while(true){ //Không xác định rõ số lần lặp
            System.out.println("Nhập lựa chọn");
            choice = scanner.next();
           if (choice.equals("x")){
               break;
           }
            System.out.println("Xin chào các bạn!!!");

        }
    }
}
