public class App {
    public static void main(String[] args) throws Exception { 
        //Tạo đối tượng calcu 
        //Cú pháp: <Tên lớp> <Tên biến tham chiếu> = new <Tên lớp>();    
        Calculator calcu = new Calculator();  

        int sum = calcu.add(); //Khởi tạo biến sum để nhận kết quả trả về từ phương thức add();
        // calcu.add() gọi tới phương thức add() trong lớp Calculator()

        System.out.println("Tổng hai số: " + sum); //in ra tổng hai số

        //Có thể trực tiếp in kết quả như sau: 
        System.out.println("Hiệu hai số: " + calcu.sub());

        int multi = calcu.multi();
        System.out.println("Tích hai số: " + multi);

        //Kiểu trả về của phương thức div() là kiểu float nên ta tạo biến div có kiểu float để nhận kết quả
        float div = calcu.div();
        System.out.println("Thương hai số: " + div);


        //Tạo đối tượng person1
        Person person1 = new Person();
        //GỌi phương thức introduceYourself()
        //các tham số truyền vào phải có cùng kiểu dữ liệu của tham số đó
        //ta có thể truyền trực tiếp như dưới
        person1.introduceYourself("Ngọc", 25, "Hà Giang");

        //Tạo biến 
        String name = "Linh";
        int age = 27;
        String address = "Hà Nội";
        Person person2 = new Person();
        person2.introduceYourself(name, age, address);

    }
}
