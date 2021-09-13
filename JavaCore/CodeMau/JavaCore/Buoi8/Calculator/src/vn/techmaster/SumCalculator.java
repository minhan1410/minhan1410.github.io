package vn.techmaster;

public class SumCalculator {

    //Bài 1
    //Nhập vào số nguyên dương n (n > 0) từ cửa sổ màn hình console.
    //Sau đó, tính tổng S(n) = 1^2 + 2^2 +…+ n^2

    public int sumSquaredUsingForLoop(int number){
        int sum = 0;
        for(int i = 1; i <= number; i++) {  //Sử dụng for để tính tổng
            sum += i*i;  //sum = sum + i*i
        }
        return sum;
    }

    public int sumSquaredUsingWhileLoop(int number){
        int sum = 0;
        int i = 1;
        while(i<=number){
            sum += i*i;
            i++;
        }
        return sum;
    }


    //Bài 2
    //Nhập vào số nguyên dương n (n > 0) từ cửa sổ màn hình console.
    //Sau đó, tính tổng S(n) = 1 + 1/2 + 1/3 +…+ 1/n

    public float sumFraction(int number){
        float sum = 0;
        for(int i = 1; i <= number; i++) {
            sum += 1.0/i;  //sum = sum + 1/i
        }

        return sum;
    }
}
