package vn.techmaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số bất kỳ: ");
        int num = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i <= num; i++){
            if(i%3 == 0){
                System.out.println("Các số chia hết cho 3 là: " +i);
                sum += i;
            }
        }
        System.out.println("Tổng các số chia hết cho 3 trong khoảng từ 0 đến "+num+" là: " + sum);
    }
}
