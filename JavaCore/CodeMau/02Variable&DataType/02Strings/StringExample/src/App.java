public class App {
    public static void main(String[] args) throws Exception {
        //Tạo chuỗi với String literal
        String str = "Hello Java";

        System.out.println("Chuỗi ban đầu: " + str);
        System.out.println(str.toUpperCase());  //method toUpperCase() chuyển chuỗi thành dạng in hoa
        System.out.println(str.toLowerCase());  //method toLowerCase() chuyển chuỗi thành dạng thường
        
        System.out.println("--------------------------------------------------");

        String s = "    Java     ";
        System.out.println("Chuỗi ban đầu: " + s);
        System.out.println("Sau khi loại bỏ khoảng trắng" + s.trim()); //method trim() loại bỏ khoảng trắng ở đầu và cuối chuỗi

        System.out.println("--------------------------------------------------");

        int length = str.length(); //method length() lấy kích thước chuỗi
        System.out.println("Kích thước chuỗi: " + length);

        System.out.println("--------------------------------------------------");

        //So sánh hai chuỗi
        String s1 = "Hello";
        String s2 = "HELLO";
        String s3 = "Hello";
        System.out.println(s1.equals(s2));   //equals(): so sánh hai chuỗi có phân biệt chữ in hoa và chữ thường
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));  //equalsIgnoreCase(): so sánh hai chuỗi không phân biệt chữ in hoa và chữ thường

        System.out.println("--------------------------------------------------");

        //Phương thức charAt()
        char c = str.charAt(6); 
        System.out.println("ký tự có index = 6 là: "+c);

        System.out.println("--------------------------------------------------");

        //Phương thức indexOf()
        int i = str.indexOf("J");
        System.out.println("Ký tự 'J' có index = "+i); 

        int j = str.indexOf("va");
        System.out.println("'va' có index = "+j); 

        int k = str.indexOf(" ", 2); //tìm khoảng trắng từ index 2
        System.out.println("Khoảng trắng tính từ index = 2 có index = "+k); 

        System.out.println("--------------------------------------------------");

        //Phương thức subString()

        s = "Ngoc Ban Quyen";
        String str1 = s.substring(5); //bắt đầu từ index 5 đến hết chuỗi
        System.out.println("Chuỗi bắt đầu từ index =5: "+str1); //str1 = "Ban Quyen"

        String str2 = s.substring(5, 8); //Bắt đầu từ index 5 đến index 8
        System.out.println("Chuỗi bắt đầu từ index = 5 đến index = 8: "+str2); //str2 = "Ban"
        
        System.out.println("--------------------------------------------------");

    
        //Phương thức replace()
        System.out.println("Chuỗi ban đầu: "+s);
        String str4 = s.replace(" ", "-"); //Thay thế khoảng trắng bằng dấu gạch ngang
        System.out.println("Chuỗi sau khi sử dụng replace(): "+str4); //str4 = "Ngoc-Ban-Quyen"

        System.out.println("--------------------------------------------------");
    }
}
