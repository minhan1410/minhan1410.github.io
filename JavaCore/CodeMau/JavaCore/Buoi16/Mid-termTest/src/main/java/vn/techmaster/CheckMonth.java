package vn.techmaster;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckMonth {

    public int inputMonth(){

        Scanner sc= new Scanner(System.in);
        int month = 0;
        do {
            boolean check = false;
            while(!check){
                try{
                    System.out.println("Nhập tháng: ");
                    month = Integer.parseInt(sc.nextLine());
                    check = true;
                }catch (NumberFormatException e){
                    System.out.println("Nhập sai rồi, vui lòng nhập lại");
                    check = false;
                }
            }
        }while(month <= 0);
        return month;

    }
    public void dayInMonth(int month){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng "+month + " có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng "+month + " có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng "+month+ " có 30 ngày");
                break;
            default:
                System.out.println("Không có tháng " + month);
                break;
        }
    }
}
