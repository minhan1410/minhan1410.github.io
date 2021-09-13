public class Calculator {
    int num1 = 15;
    int num2 = 5;

    public int add(){    //Phương thức add() có kiểu trả về là int
        int sum = num1 + num2;
        return sum;   //return sum là tổng hai số num1 và num2
    }

    public int sub(){
        return num1 - num2;
    }

    public int multi(){
        return num1*num2;
    }

    public float div(){  //Vì phép chia có thể trả về một số thực nên ta sử dụng kiểu trả về là float hoặc double
        return (float) num2/num1;  //Ép sang kiểu float trước rồi mới chia hai số
    }
    
}
