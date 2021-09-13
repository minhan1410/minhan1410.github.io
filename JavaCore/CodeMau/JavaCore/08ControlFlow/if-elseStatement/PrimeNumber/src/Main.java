public class Main {
    public static void main(String[] args) {
        int number = 7;
        if (checkPrimeNumber(number)){
            System.out.println(number + " là số nguyên tố");
        }else{
            System.out.println(number + " không là số nguyên tố");
        }
    }

    static boolean checkPrimeNumber(int number){
        if(number < 2){
            return false;  //số nguyên tố là các số lớn hơn hoặc bằng 2
        }

        for(int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
