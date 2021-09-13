import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = new String("Hello");
        //Tạo đối tượng sc
        Scanner sc = new Scanner(System.in); //System.in: Nhập thông tin từ bàn phím
        //Sử dụng các phương thức của lớp Scanner để nhập dữ liệu từ bàn phím
        System.out.println("Nhập chuỗi: ");
        String str1 = sc.next(); //next() trả về nội dung trước khoảng trắng

        System.out.println("Nhập chuỗi: ");
        String str2 = sc.nextLine(); //Trả về nội dung của chuỗi nhập vào

        System.out.println("Nhập dữ liệu kiểu byte: ");
        byte byteNumber = sc.nextByte(); //Trả về dữ liệu kiểu byte

        System.out.println("Nhập dữ liệu kiểu short: ");
        short shortNumber = sc.nextShort(); //Trả về dữ liệu kiểu short

        System.out.println("Nhập dữ liệu kiểu int: ");
        int intNumber = sc.nextInt(); //Trả về dữ liệu kiểu int

        System.out.println("Nhập dữ liệu kiểu long: ");
        long longNumber = sc.nextLong();  //Trả về dữ liệu kiểu long

        System.out.println("Nhập dữ liệu kiểu float: ");
        float floatNumber = sc.nextFloat();  //Trả về dữ liệu kiểu float

        System.out.println("Nhập dữ liệu kiểu double: ");
        double doubleNumber = sc.nextDouble();  //Trả về dữ liệu kiểu double


        //In thông tin
        System.out.println("In chuỗi với next(): "+str1);
        System.out.println("In chuỗi với nextLine(): "+str2);
        System.out.println("In số kiểu byte: "+byteNumber);
        System.out.println("In số kiểu short: "+shortNumber);
        System.out.println("In số kiểu int: "+intNumber);
        System.out.println("In số kiểu long: "+longNumber);
        System.out.println("In số kiểu float: "+floatNumber);
        System.out.println("In số kiểu double: "+doubleNumber);

        sc.close();
    }
}
