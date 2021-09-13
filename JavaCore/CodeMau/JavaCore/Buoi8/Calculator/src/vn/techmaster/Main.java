package vn.techmaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long start, finish, timeElapsed;
        SumCalculator sumCalculator = new SumCalculator();

        Scanner scanner = new Scanner(System.in);
        int number;
        do{   //Dùng vòng lặp do while để yêu cầu người dùng nhập lại giá trị nếu number <= 0
            System.out.println("Input number = ");
            number = scanner.nextInt();
        }while(number <= 0);

        start = System.nanoTime();
        System.out.println(start);
        System.out.printf("1^2 + 2^2 + ... +%d^2 = %d\n", number, sumCalculator.sumSquaredUsingForLoop(number));
        finish = System.nanoTime();
        System.out.println(finish);
        timeElapsed = finish - start;
        System.out.println("Cách 1: "+timeElapsed);

        start = System.nanoTime();
        System.out.printf("1^2 + 2^2 + ... +%d^2 = %d\n", number, sumCalculator.sumSquaredUsingWhileLoop(number));
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("Cách 2: "+timeElapsed);

        //System.out.printf("1 + 1/2 + 1/3 + ... + 1/%d = %f\n", number, sumCalculator.sumFraction(number));

    }
}
