package vn.techmaster;

public class Calculator {
    public void sum1(){
        System.out.println("Tổng" + (6+8));
    }
    public int sum(){
        return 6 + 8;
    }

    public double div(){
        return 5/7;
    }
    public String say(){
        String str = "Hello";
        return str;
    }

    public float sub(float a, float b, int c){
        return (a - b - c);
    }
}
