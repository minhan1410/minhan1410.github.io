package vn.techmaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập b: ");
        int b = scanner.nextInt();

        if (a == 0){
            if (b == 0){
                System.out.println("Phương trình có vô số nghiệm");
            }else{
                System.out.println("Phương trình vô nghiệm");
            }
        }else{
            double x = (double) -b/a;
            System.out.printf("Nghiệm của phương trình là: x = %.2f", x);
        }

    }
}
