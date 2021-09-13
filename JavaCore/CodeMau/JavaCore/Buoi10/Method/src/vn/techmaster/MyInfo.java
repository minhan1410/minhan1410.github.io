package vn.techmaster;

import java.util.Scanner;

public class MyInfo {
    String infomation(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên:");
        String name = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.valueOf(scanner.nextLine());
        //int age = scanner.nextInt();
//        scanner.nextLine();

        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        String str = "Tôi tên là "+name + ", năm nay tôi "+age+" tuổi, tôi đến từ "+address;

        return str;
    }
}
