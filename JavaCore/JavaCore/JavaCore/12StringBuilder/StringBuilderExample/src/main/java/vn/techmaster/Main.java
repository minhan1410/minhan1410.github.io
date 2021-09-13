package vn.techmaster;

public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();  //Khởi tạo chuỗi str rỗng
//        System.out.println("Dung luong chuoi str: "+str.capacity());
//        str.appendCodePoint(44);
//        str.appendCodePoint(45);
//        str.appendCodePoint(65);
//        System.out.println(str);
        StringBuilder str2 = new StringBuilder("Hello Java");  //Khởi tạo chuỗi str2 với một chuỗi cụ thể

        StringBuilder str3 = new StringBuilder(50); //Khởi tạo chuỗi không có ký tự nào và có dung lượng ban đầu là 50
        CharSequence obj = "Cat";
        StringBuilder str4 = new StringBuilder(obj); //Khởi tạo chuỗi với CharSequence

//        int i = str2.indexOf("a");
//        System.out.println("Vị trí đầu tiên của chữ a: " +i);
//        int j = str2.lastIndexOf("a");
//        System.out.println("Vị trí cuối cùng của chữ a: "+j);
//        System.out.println("Dung luong chuoi str2: "+str2.capacity());
//        System.out.println("Kích thước chuỗi str2: "+str2.length());
//
//        System.out.println("Chuỗi con: "+str2.substring(6));
//        System.out.println("Chuỗi con: "+str2.substring(0, 5));
//
//
////        System.out.println("Chuỗi ban đầu: "+str2);
////        str2.append(' ');
////        str2.append(4.5);
////        str2.append(true);
////        str2.append('d');
////        System.out.println("Chuỗi sau khi nối: "+str2);
//        System.out.println(str4);
//
//        Example example = new Example();
//
//        System.out.println("\nAppend-------------------------------------");
//        System.out.println(example.usingAppend(str));
//
//        System.out.println("\nInsert-------------------------------------");
//        System.out.println(example.usingInsert(str));
//
//        System.out.println("\nReplace-------------------------------------");
//        System.out.println(example.usingReplace(str));
//
//        System.out.println("\nDelete-------------------------------------");
//        System.out.println(example.usingDelete(str));
//
//        System.out.println("\nsubstring----------------------------------");
//        System.out.println(str2.substring(6));
//        System.out.println(str2.substring(0,5));
//
        ReverseName reName = new ReverseName();
        String newName = reName.reverse("Lục Thanh Ngọc");
        System.out.println(newName);

//        Efficiency efficiency = new Efficiency();
//        efficiency.compareStringAndStringBuilder();


    }
}
