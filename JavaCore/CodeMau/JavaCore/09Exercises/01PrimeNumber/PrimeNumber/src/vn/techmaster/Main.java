package vn.techmaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();

        Scanner sc = new Scanner(System.in);
        while(true){
            menu();
            int choose = sc.nextInt();
            int amount;
            switch (choose) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    long start = System.nanoTime();
                    System.out.print("Nhập số lượng số nguyên tố: ");
                    amount = sc.nextInt();
                    System.out.println("Danh sách "+amount+" số nguyên tố đầu tiên, sử dụng for loop: ");
                    primeNumber.printFirstPrimeNumberUsingForLoop(amount);
                    long finish = System.nanoTime();
                    long timeElapsed = finish - start;
                    System.out.println("Cách 1: "+timeElapsed);
                    break;
                case 2:
                    start = System.nanoTime();
                    System.out.print("Nhập số lượng số nguyên tố: ");
                    amount = sc.nextInt();
                    System.out.println("Danh sách 10 số nguyên tố đầu tiên, sử dụng while loop: ");
                    primeNumber.printFirstPrimeNumberUsingWhileLoop(amount);
                    finish = System.nanoTime();
                    timeElapsed = finish - start;
                    System.out.println("Cách 2: "+timeElapsed);
                    break;
                case 3:
                    start = System.nanoTime();
                    System.out.print("Nhập số lượng số nguyên tố: ");
                    amount = sc.nextInt();
                    System.out.println("Danh sách 10 số nguyên tố đầu tiên, sử dụng do while loop: ");
                    primeNumber.printFirstPrimeNumberUsingDoWhileLoop(amount);
                    finish = System.nanoTime();
                    timeElapsed = finish - start;
                    System.out.println("Cách 2: "+timeElapsed);
                    break;
                case 4:
                    start = System.nanoTime();

                    System.out.println("Danh sách các số nguyên tố nhỏ hơn 100, sử dụng for loop: ");
                    primeNumber.printPrimeNumberUsingForLoop();

                    finish = System.nanoTime();
                    timeElapsed = finish - start;
                    System.out.println("Cách sử dụng for loop: "+timeElapsed);
                    break;
                case 5:
                    start = System.nanoTime();

                    System.out.println("Danh sách các số nguyên tố nhỏ hơn 100, sử dụng while loop: ");
                    primeNumber.printPrimeNumberUsingWhileLoop();

                    finish = System.nanoTime();
                    timeElapsed = finish - start;
                    System.out.println("Cách sử dụng while loop: "+timeElapsed);
                    break;
                case 6:
                    start = System.nanoTime();

                    System.out.println("Danh sách các số nguyên tố nhỏ hơn 100, sử dụng do...while loop: ");
                    primeNumber.printPrimeNumberUsingDoWhileLoop();

                    finish = System.nanoTime();
                    timeElapsed = finish - start;
                    System.out.println("Cách sử dụng do...while loop: "+timeElapsed);
                    break;
        }
        }



    }

    static void menu(){
        System.out.println("\nNhập lựa chọn: ");
        System.out.println("1 - Liệt kê n số nguyên tố đầu tiên, sử dụng for loop");
        System.out.println("2 - Liệt kê n số nguyên tố đầu tiên, sử dụng while loop");
        System.out.println("3 - Liệt kê n số nguyên tố đầu tiên, sử dụng do while loop");
        System.out.println("4 - Liệt kê các số nguyên tố nhỏ hơn 100, sử dụng for loop");
        System.out.println("5 - Liệt kê các số nguyên tố nhỏ hơn 100, sử dụng while loop");
        System.out.println("6 - Liệt kê các số nguyên tố nhỏ hơn 100, sử dụng do while loop");
        System.out.println("0 - Thoát chương trình");
        System.out.print("Lựa chọn của bạn là: ");

    }

}
