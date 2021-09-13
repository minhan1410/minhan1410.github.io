package vn.techmaster;

public class Calculator {
    public int sumSquared(int number){
        int sum = 0;
        for(int i = 1; i <= number; i++) {  //Sử dụng for để tính tổng
            sum += i*i;  //sum = sum + i*i
        }
        return sum;
    }

    public float sumFraction(int number){
        float sum = 0;
        for(int i = 1; i <= number; i++) {
            sum += 1.0/i;  //sum = sum + 1/i
        }

        return sum;
    }
}
