public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0){ // i chia hết cho 3
                if (i % 5 == 0){  //i chia hết cho  5
                    System.out.println("FizzBuzz");
                }else{  //i không chia hết cho 5 mà chỉ chia hết cho 3
                    System.out.println("Fizz");
                }
            }else{ //i không chia hết cho 3
                if(i % 5 == 0){ // i chia hết cho 5
                    System.out.println("Buzz");
                }else{ // i không chia hết cho cả 3 và 5
                    System.out.println(i);
                }
            }
        }

        //i = 10;
    }
}
