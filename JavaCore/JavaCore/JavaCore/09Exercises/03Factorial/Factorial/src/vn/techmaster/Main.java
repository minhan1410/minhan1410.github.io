package vn.techmaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số bất kỳ: ");
        int number = scanner.nextInt();
        System.out.println(number+"! = "+factorialCaculator(number) );
        scanner.close();

    }

    static int factorialCaculator(int number) {
        int factorial = 1;  //khởi tạo biến giai thừa có giá trị ban đầu = 1
        if(number == 0 || number == 1){  //Nếu number == 0 hoặc number == 1 thì trả về factorial
            return factorial;   //0! = 1, 1! = 1
        }else{
            for(int i = 2; i <= number; i++){  // Vòng lặp for với i chạy từ 2 đến number
                factorial *= i;  //factorial = factorial*i
            }
            return factorial; //trả về kết quả factorial
        }
    }
}
