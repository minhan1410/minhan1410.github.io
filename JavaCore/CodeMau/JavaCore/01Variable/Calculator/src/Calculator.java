public class Calculator {
    int a = 8;
    int b = 20;

    void sum(){ //từ khóa void: phương thức không có giá trị trả về
        System.out.println("Tổng của a và b là: " + a+b);
    }

    int addition(){  //Kiểu trả về phải được định nghĩa trước tên phương thức, ở đây là kiểu int
        return a+b;  //sử dụng return để kết thúc và trả về giá trị
    }

    int subtraction(){
        return a-b;
    }

    int multiplication(){
        return a*b;
    }

    double division(){ //Kiểu trả về là double
        return (double) a/(double) b; //ép kiểu cho 2 biến a và b sang double
    }


}
