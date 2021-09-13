public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); //Tạo đối tượng

        calculator.sum(); //gọi phương thức sum có kiểu trả về là void

        System.out.println("Tổng: "+calculator.addition()); //gọi phương thức addition() có kiểu trả vè là int

        System.out.println("Trừ: "+calculator.subtraction());

        System.out.println("Nhân: " +calculator.multiplication());

        System.out.println("Thương: "+calculator.division()); //gọi phương thức divition() có kiểu trả về là double
    }
}
