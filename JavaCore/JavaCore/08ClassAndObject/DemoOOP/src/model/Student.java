package model;
import java.util.Scanner;


public class Student {
    int id;
    String name;
    double theoryPoint;
    double practicePoint;
    static String school = "Techmaster";
    
    public Student() {
    }

    public Student(int id, String name, double theoryPoint, double practicePoint) {
        this.id = id;
        this.name = name;
        this.theoryPoint = theoryPoint;
        this.practicePoint = practicePoint;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        id = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        theoryPoint = sc.nextDouble();
        System.out.println("Nhập điểm thực hành: ");
        practicePoint = sc.nextDouble();

    }

    public double avgPoint(){
        return (theoryPoint + practicePoint)/2;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + theoryPoint
                + " - "+practicePoint + " - " + avgPoint();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTheoryPoint() {
        return theoryPoint;
    }

    public void setTheoryPoint(double theoryPoint) {
        this.theoryPoint = theoryPoint;
    }

    public double getPracticePoint() {
        return practicePoint;
    }

    public void setPracticePoint(double practicePoint) {
        this.practicePoint = practicePoint;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }
}
