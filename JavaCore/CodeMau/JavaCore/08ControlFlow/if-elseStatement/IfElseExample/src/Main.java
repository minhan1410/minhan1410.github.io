public class Main {
    public static void main(String[] args) {
        checkEven_Odd();

        String str1 = "Java";
        String str2 = "HTML";
        compareTwoString(str1, str2);

        //Tính BMI và in kết quả
        double weight = 40;
        double height = 1.5;
        BMICalculator bmiCal = new BMICalculator();
        double bmi = bmiCal.bmiCalculator(weight, height);
        System.out.printf("Chỉ số bmi của tôi là: %.2f\n", bmi);
        bmiCal.compareBmi(bmi);

        //So sánh 3 số
        int number1 = 4;
        int number2 = 2;
        int number3 = 6;

        CompareNumber compareNumber = new CompareNumber();
        compareNumber.compareThreeNumber(number1,number2,number3);

        //Chuyển đổi số thành chữ

        int number = 4;
        NumberToText numberToText = new NumberToText();
        numberToText.convert(number);

    }

    //Phương thức kiểm tra số chẵn lẻ
    static void checkEven_Odd() {
        int i = 10;
        if (i % 2 == 0){  //Nếu i chia hết cho 2
            System.out.println(i + " là số chẵn");
        }else{ //Ngược lại với câu điều kiện, i không chia hết cho 2
            System.out.println(i + " là số lẻ");
        }
    }

    //Phương thức so sánh hai chuỗi
    static void compareTwoString(String str1, String str2) {
        if (str1.equals(str2)) {   //Sử dụng phương thức equals() để so sánh hai chuỗi
            System.out.println("Hai chuỗi giống nhau!!!");
        }else {
            System.out.println("Hai chuỗi khác nhau!!!");
        }
    }


}
