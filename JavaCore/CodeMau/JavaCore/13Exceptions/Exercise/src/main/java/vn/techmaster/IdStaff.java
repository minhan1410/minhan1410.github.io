package vn.techmaster;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IdStaff {
    public void input() {
        Scanner sc = new Scanner(System.in);
        int amount = 0;
        try {
            amount = amountStaff();
        } catch (InputNumberException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        String[] arr = new String[amount];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Nhập mã nhân viên: ");
            String id = sc.nextLine();
            boolean check = id.matches("NV\\d{7}");
            while (!check){
                System.out.println("Nhập sai rồi, vui lòng nhập lại : ");
                id = sc.nextLine();
                check = id.matches("NV\\d{7}");
            }
            arr[i] = id;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    public int amountStaff() throws InputNumberException{
        Scanner sc = new Scanner(System.in);
        int n = 0;

        try {
            System.out.println("Nhập số nhân viên: ");
            n = sc.nextInt();
            sc.nextLine();
            if(n <= 0) throw new InputNumberException("Cần nhập số lớn hơn 0");
        }catch (InputMismatchException e){
            throw new InputNumberException("Cần nhập số");
        }
        return n;
    }
}
