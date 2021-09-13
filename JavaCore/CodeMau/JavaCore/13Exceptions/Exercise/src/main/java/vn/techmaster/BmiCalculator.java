package vn.techmaster;

import java.util.Scanner;

public class BmiCalculator {

    public double bmiCalculator(){
        double bmi = 0;
        double weight = 0;
        double height = 0;
        Scanner scanner = new Scanner(System.in);

        while (weight <= 0){
            try{
                System.out.println("Nhập cân nặng: ");
                weight = scanner.nextDouble();
            }catch(Exception e){
                System.out.println("Cân nặng là một số");
                System.exit(0);
            }
        }

        while (height <= 0){
            try{
                System.out.println("Nhập chiều cao: ");
                height = scanner.nextDouble();
            }catch(Exception e){
                System.out.println("Chiều cao là một số");
                System.exit(0);
            }
        }

        bmi = weight / (height*height);

        return bmi;
    }

    public void resultBMI(){
        double bmi = bmiCalculator();
        if (bmi < 18.5){
            System.out.println("Thiếu cân");
        }else if(bmi >=18.5 && bmi<20){
            System.out.println("Cân đối");
        }else{
            System.out.println("Thừa cân");
        }
    }
}
