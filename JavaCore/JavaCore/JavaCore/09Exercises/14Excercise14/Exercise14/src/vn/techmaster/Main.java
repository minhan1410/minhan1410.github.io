package vn.techmaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số bất kỳ: ");
        int num = scanner.nextInt();

        System.out.println("Số bạn vừa nhập là: " + num);

        if (num > 0) {
            System.out.println(num + " là số nguyên dương");
        } else if (num == 0) {
            System.out.println(num + " không là sô nguyên âm cũng không là số nguyên dương");

        } else {
            System.out.println(num + " là số nguyên âm");
        }
    }
}
