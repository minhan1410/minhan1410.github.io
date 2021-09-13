package vn.techmaster;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

//        calculator.sum1();
//        //Cách 1: Tạo một biến có cùng kiểu trả về của phương thức để nhận giá trị
//        int sum = calculator.sum();
//        System.out.println(sum);
//
//        //Cách 2: Thực hiện in luôn kết quả
//        System.out.println("Tổng: " + calculator.sum());
//
//        double div = calculator.div();
//        System.out.println(div);


//        String s = calculator.say();
//        System.out.println(s);
//
//        System.out.println(calculator.say());
//
//        s = s.toUpperCase();
//        System.out.println(s);
//
//        //Với phương thức có tham số
//        int sub = calculator.sub(7, 3);
//        System.out.println(sub);

//        float number1 = 8f;
//        float number2 = 1f;
//        int number3 = 1;
//        float sub = calculator.sub(number1, number2, number3);

        MyInfo info = new MyInfo();
        System.out.println(info.infomation());

    }
}
