package vn.techmaster;

public class Employee {
    int id;
    String name;
    int age;


    // phím tắt Alt + insert
    public Employee(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return id + " - " +name +" - " + age;
    }
}
