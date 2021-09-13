package vn.techmaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        int sideA = scanner.nextInt();

        System.out.print("Nhập cạnh b: ");
        int sideB = scanner.nextInt();

        System.out.print("Nhập cạnh c: ");
        int sideC = scanner.nextInt();

        if (checkTriangle(sideA,sideB,sideC)){
            if (checkEquilateralTriangle(sideA, sideB, sideC)){
                System.out.println("3 cạnh trên là 3 cạnh tam giác đều");
            }else if(checkIsoscelesTriangle(sideA, sideB, sideC)){
                System.out.println("3 cạnh trên lập thành tam giác cân");
            }else if(checkRightTriangle(sideA, sideB, sideC)){
                System.out.println("3 cạnh trên lập thành tam giác vuông");
            }else{
                System.out.println("3 cạnh trên lập thành 1 tam giác");
            }
        }
    }

    //Phương thưc kiểm tra tam giác
    static boolean checkTriangle(int a, int b, int c){
        if (a+b>c && a+c>b && b+c>a){
            return true;
        }else{
            return false;
        }

    }


    //Phương thức kiểm tra tam giác đều
    static boolean checkEquilateralTriangle(int a, int b, int c){
        if (a == b && a == c){  //Nếu 3 cạnh bằng nhau là tam giác đếu
            return true;
        }else{
            return false;
        }
    }

    //Phương thức kiểm tra tam giác cân
    static boolean checkIsoscelesTriangle (int a, int b, int c){
        if(a == b || b == c || c == a){  //nếu 2 cạnh bằng nhau là tam giác cân
            return true;
        }else{
            return false;
        }
    }

    //Phương thức kiểm tra tam giác vuông
    static boolean checkRightTriangle (int a, int b, int c){  //Áp dụng định lý pytago
        if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b){
            return true;
        }else{
            return false;
        }
    }



}
