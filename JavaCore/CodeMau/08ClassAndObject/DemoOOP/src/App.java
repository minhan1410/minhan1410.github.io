import java.util.ArrayList;
import java.util.Scanner;

import model.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Student[] arrStudents = new Student[3]; //KHởi tạo mảng có kích thước = 5
        // for(int i = 0; i < arrStudents.length; i++){
        //     Student student = new Student();
        //     System.out.println("Nhập thông tin học viên thứ " +(i+1));
        //     student.input();
        //     arrStudents[i] = student;
        // }

        // System.out.println("Thông tin học viên: ");
        // for (Student student : arrStudents) {
        //     System.out.println(student);
        // }

        // ArrayList<String> listName = new ArrayList<>();
        // listName.add("Ngoc");
        // listName.add("Hung");
        // listName.add("Hoa");
        // listName.add("Tuan");

        // for (String s : listName) {
        //     System.out.println(s);
        // }

        // System.out.println("Danh sách sau khi thêm: ");
        // listName.add("Loan");
        // for (String s : listName) {
        //     System.out.println(s);
        // }

        // listName.add(1, "Mai");

        // System.out.println("Danh sách sau khi chèn: ");
        // for (String s : listName) {
        //     System.out.println(s);
        // }

        // listName.set(1, "Son");
        // System.out.println("Danh sách sau khi sửa: ");
        // for (String s : listName) {
        //     System.out.println(s);
        // }

        // System.out.println("Số phần tử trong danh sách là: " + listName.size());

        // boolean isCheck = listName.contains("Ngoc");
        // System.out.println("Trong danh sách có ngoc không: " +isCheck);
        // System.out.println("Ngoc nằm ở index: " + listName.indexOf("Ngoc"));

        // listName.add("Ngoc");
        // System.out.println("Ngoc nằm ở index cuối cùng là: " + listName.lastIndexOf("Ngoc"));

        // System.out.println("Phần tử có indexx = 3 là : " + listName.get(3));

        // listName.remove("Ngoc");
        // listName.remove(4);
        // System.out.println("Danh sách sau khi xoá: ");
        // for (String string : listName) {
        //     System.out.println(string);
        // }

        // listName.clear();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng học sinh: ");
        int size = sc.nextInt();
        
        ArrayList<Student> listStudents = new ArrayList<>();

        for(int i = 0; i < size; i++){
            System.out.println("Nhập thông học sinh thứ " +(i+1));
            Student student = new Student();
            student.input();

            listStudents.add(student);
        }

        System.out.println("Danh sách học sinh: ");
        for (Student students : listStudents) {
            System.out.println(students);
        }

        sc.nextLine();
        System.out.println("Nhập tên muốn tìm kiếm: ");
        String name = sc.nextLine();

        for(int i = 0; i < size; i++){
            if(listStudents.get(i).getName().equalsIgnoreCase(name)){
                System.out.println(listStudents.get(i));
                listStudents.remove(listStudents.get(i));
            }
        }

        System.out.println("Danh sách sau khi xoá: ");
        for (Student student : listStudents) {
            System.out.println(student);
        }
        // Person person1 = new Person(); //Tạo đối tượng person1
        
        // // person1.name = "John";
        // // person1.age = 22;
        // // person1.address = "England";
        // person1.setName("John");
        // person1.setAge(20);
        // person1.setAddress("England");

        // System.out.println("Name: " +person1.getName());
        // System.out.println("Age: " + person1.getAge());
        // System.out.println("Address: " + person1.getAddress());
       

        // person1.study("math");
        // Person.setSchool();

        // Person person2 = new Person();
        // person2.name = "Lily";

        // person2.study("English");

        // Person person3 = new Person("Jane", 25, "England");
        // System.out.println(person3.age);

        // //person1.show();


        // System.out.println(person1.toString());
        // System.out.println(person2.toString());
        // System.out.println(person3.toString());

        // Student student1 = new Student();
        // student1.input();
        // System.out.println(student1.toString());
        
    }
}
