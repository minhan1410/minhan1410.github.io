package vn.techmaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int number;
        do{   //Dùng vòng lặp do while để yêu cầu người dùng nhập lại giá trị nếu number <= 0
            System.out.println("Input number = ");
            number = scanner.nextInt();
        }while(number <= 0);

        System.out.printf("1^2 + 2^2 + ... +%d^2 = %d\n", number, calculator.sumSquared(number));

        System.out.printf("1 + 1/2 + 1/3 + ... + 1/%d = %f\n", number,calculator.sumFraction(number));
    }
}
