public class Main {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(n + " số nguyên tố đầu tiên: ");
        first10Primes(n);

        int m = 100;
        System.out.println("\nCác số nguyên tố nhỏ hơn " + m +" là: ");
        primesAreLessThan(m);

    }

    //in ra n số nguyên tố đầu tiên
    static void first10Primes(int n) {
        int i = 2;
        int count = 0;
        while (count < n) {
            if (checkPrimeNumber(i)) {
                System.out.print(i + "\t");
                count++;
            }
            i++;
        }
    }

    //Liệt kê các số nguyên tố nhỏ 100
    static void primesAreLessThan(int m){
        for (int i = 0; i < m; i++){
            if (checkPrimeNumber(i)) {
                System.out.print(i + "\t");
            }
        }
    }


    //Kiểm tra số nguyên tố
    static boolean checkPrimeNumber(int number){
        if(number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
