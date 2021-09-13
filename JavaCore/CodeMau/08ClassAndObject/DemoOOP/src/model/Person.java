package model;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String address;
    static String school = "CNTT";

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Person.school = school;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    static void setSchool(){
        school = "Techmaster";
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        age = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập địa chỉ: ");
        address = sc.nextLine();

    }
    
    public Person() {
        System.out.println("Đây là constructor mặc định");
    }

    
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void study(String subject){
        System.out.println(name + " study " + subject);
    }

    @Override
    public String toString() {   
        return name + " - " + age + " - " + address + " - " + school;
    }

    public void show(){
        System.out.println("Name: " + name );
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("School: " + school);
    }
}