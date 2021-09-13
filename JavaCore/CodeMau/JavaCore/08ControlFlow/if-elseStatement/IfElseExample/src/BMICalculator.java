public class BMICalculator {
    double bmiCalculator(double weight, double height){
        double bmi = weight / (height*height);
        return bmi;
    }

    void compareBmi(double bmi){
        if(bmi < 18.5){
            System.out.println("Thiếu cân!!!");
        }else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Cân đối!!!");
        }else {
            System.out.println("Thừa cân!!!");
        }
    }
}
