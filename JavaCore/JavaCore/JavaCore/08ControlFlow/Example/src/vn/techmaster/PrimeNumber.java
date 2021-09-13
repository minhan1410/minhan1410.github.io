package vn.techmaster;

public class PrimeNumber {

    public boolean isPrimeUsingForLoop(int number){
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

    public boolean isPrimeUsingWhileLoop(int number) {
        if (number < 2) {
            return false;
        }
        int i = 2;
        while(i <= Math.sqrt(number)){
            if (number % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }


}
