package vn.techmaster;

public class PrimeNumber {
    final int MAX = 100;

    //Liệt kê các số nguyên tố nhỏ hơn 100, sử dụng for loop
    void printPrimeNumberUsingForLoop(){
        for(int i = 0; i < MAX; i++){
            if (checkPrimeNumber(i)){
                System.out.print(i + "\t");
            }
        }
    }

    //Liệt kê các số nguyên tố nhỏ hơn 100, sử dụng while loop
    void printPrimeNumberUsingWhileLoop(){
        int i = 0;
        while(i < 100){
            if (checkPrimeNumber(i)){
                System.out.print(i + "\t");
            }
            i++;
        }
    }

    //Liệt kê các số nguyên tố nhỏ hơn 100, sử dụng do...while loop
    void printPrimeNumberUsingDoWhileLoop(){
        int i = 0;
        do {
            if (checkPrimeNumber(i)){
                System.out.print(i + "\t");
            }
            i++;
        } while(i < 100);
    }


    //Liệt kê n số nguyên tố đầu tiên, sử dụng for loop
    void printFirstPrimeNumberUsingForLoop(int number){
        int count = 0;
        for(int i = 0; count < number; i++){
            if (checkPrimeNumber(i)){
                System.out.print(i + "\t");
                count++;
            }
        }
    }

    //Liệt kê n số nguyên tố đầu tiên, sử dụng while loop
    void printFirstPrimeNumberUsingWhileLoop(int number){
        int count = 0;
        int i = 2;
        while (count < number){
            if (checkPrimeNumber(i)) {
                System.out.print(i+"\t");
                count++;
            }
            i++;
        }
    }

    //Liệt kê n số nguyên tố đầu tiên, sử dụng do...while loop
    void printFirstPrimeNumberUsingDoWhileLoop(int number){
        int count = 0;
        int i = 2;
        do {
            if (checkPrimeNumber(i)) {
                System.out.print(i+"\t");
                count++;
            }
            i++;
        }while (count < number);
    }

    //Phương thức để kiểm tra số nguyên tố
    static boolean checkPrimeNumber(int number){
        if(number < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
