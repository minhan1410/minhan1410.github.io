public class Main {
    public static void main(String[] args) {
        //Tạo String bằng từ khóa new
        char[] ch = {'T', 'e','c','h','m','a','s','t','e','r'};
        String str1 = new String(ch);
        //Hoặc
        String str2 = new String("Techmaster");


        //Tạo String bằng String literal
        String str3 = "Techmaster";

        //Một số phương thức lớp String
        String s = "Ngoc Ban Quyen";

        //Phương thức charAt()
        char c = s.charAt(6);
        System.out.println("ký tự có index = 6 là: "+c); // c = 'a'
        System.out.println("\n -------------------------------------\n");

        //Phương thức indexOf()
        int i = s.indexOf("B");
        System.out.println("Ký tự 'B' có index = "+i); //i = 5

        int j = s.indexOf("uy");
        System.out.println("'uy' có index = "+j); //j = 10

        int k = s.indexOf(" ", 7); //tìm khoảng trắng từ index 7
        System.out.println("Khoảng trắng tính từ index = 7 có index = "+k); //k = 8

        System.out.println("\n -------------------------------------\n");

        //Phương thức subString()

        String s1 = s.substring(5); //bắt đầu từ index 5 đến hết chuỗi
        System.out.println("Chuỗi bắt đầu từ index =5: "+s1); //s1 = "Ban Quyen"

        String s2 = s.substring(5, 8); //Bắt đầu từ index 5 đến index 8
        System.out.println("Chuỗi bắt đầu từ index = 5 đến index = 8: "+s2); //s2 = "Ban"

        System.out.println("\n -------------------------------------\n");

        //Phương thức trim()
        String s3 = "   Java    ";
        System.out.println("Chuỗi ban đầu: "+s3);  //   Java
        System.out.println("Chuỗi sau khi xóa khoảng trắng: "+s3.trim()); //Java

        System.out.println("\n -------------------------------------\n");

        //Phương thức replace()
        System.out.println("Chuỗi ban đầu: "+s);
        String s4 = s.replace(" ", "-");
        System.out.println("Chuỗi sau khi sử dụng replace(): "+s4); //s4 = "Ngoc-Ban-Quyen"

        System.out.println("\n -------------------------------------\n");

        //Phương thức lenght()
        int size = s.length();
        System.out.println("Kích thước chuỗi s: "+size); //size = 14

        System.out.println("\n -------------------------------------\n");

        //Phương thức split()
        String [] result = s4.split("\\-"); //chia nhỏ chuỗi s4 với dấu "-"
        System.out.println("Chuỗi sau khi tách: ");
        for(String r : result){
            System.out.println(r);
        }
        //Kết quả:
        //Ngoc
        //Ban
        //Quyen

        System.out.println("\n -------------------------------------\n");
        //Phương thức toUpperCase và toLowerCase
        System.out.println("Chuỗi ban đầu: "+s); //Ngoc Ban Quyen
        System.out.println("Sử dụng toUpperCase: "+s.toUpperCase()); //NGOC BAN QUYEN
        System.out.println("Sử dụng toLowerCase: "+s.toLowerCase()); //ngoc ban quyen

        System.out.println("\n -------------------------------------\n");

        //Phương thức equals() và equalsIgnoreCase()
        String s5 = s.toUpperCase();
        System.out.println("Chuỗi s: "+s);
        System.out.println("Chuỗi s5: "+s5);
        System.out.println("So sánh hai chuỗi s và s5 sử dụng equals: "+s5.equals(s));
        System.out.println("So sánh hai chuỗi s và s5 sử dụng equalsIgnoreCase: "+s5.equalsIgnoreCase(s));

    }
}
