package vn.tecmaster;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();  //Tạo đối tượng random

        int num = rand.nextInt(10);  //Tạo ngẫu nhiên 1 số từ 0 -> 10

        //Kiểm tra số nguyên tố
        if (isPrimeNumber(num)){
            System.out.println(num + " là số nguyên tố");
        }else{
            System.out.println(num + " không là số nguyên tố");
        }

        //Tính giai thừa
        System.out.println("Giai thừa "+num+"! = "+factorialCaculator(num));

    }

    //Phương thức kiểm tra số nguyên tố
    static boolean isPrimeNumber(int number){
        if(number < 2){
            return false;
        }
        for(int i = 2; i < Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }


    //Phương thức tính giai thừa
    static int factorialCaculator(int number) {
        int factorial = 1;
        if(number == 0 || number == 1){
            return factorial;
        }else{
            for(int i = 2; i <= number; i++){
                factorial *= i;
            }
            return factorial;
        }
    }
}
