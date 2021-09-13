package vn.techmaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số fibonacci bạn muốn : ");
        int amount = scanner.nextInt();

        listFibonacci(amount);
        System.out.println();

        listFibonacciLessThan100();




    }

    //In danh sách amount số fibonacci đầu tiên
    static void listFibonacci(int amount){
        System.out.println("Danh sách "+amount+" số fibonacci đầu tiên là: ");
        for (int i = 0; i < amount; i++){  //tạo vòng lặp, i chạy từ 0 đến amount
            System.out.print(fibonacci(i) + "\t");  //in ra các số là số fibonacci
        }
    }

    //Liệt kê các số fibonacci nhỏ hơn 100
    static void listFibonacciLessThan100(){
        int i = 0;
        System.out.println("Danh sách các số fibonacci nhỏ hơn 100: ");
        while (fibonacci(i) < 100){  //điều kiện là số fibonacci nhỏ hơn 100
            System.out.print(fibonacci(i) + "\t");  //in ra số fibonacci
            i++; //tăng i 1 đơn vị
        }
    }

    static int fibonacci(int number){
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if(number < 0){  //Kiểm tra number có nhỏ hơn 1 hay không, nếu nhỏ hơn không thực hiện gì cả
            return -1;
        }else if(number == 0 || number == 1){  //Nếu number == 0 hoặc number == 1, trả lại số đó vì 0 và 1 là số fibonacci
            return number;
        }else{
            for(int i = 2; i < number; i++){ //tạo vòng lặp, chạy biến i từ 2 đến number-1
                f0 = f1;  //gán f0 = f1
                f1 = fn;  //gán f1 = fn
                fn = f0 + f1;  //gán fn = f0+f1
            }
        }
        return fn;
    }
}
