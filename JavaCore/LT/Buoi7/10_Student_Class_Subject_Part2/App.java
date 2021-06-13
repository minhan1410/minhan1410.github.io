import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    System.out.println("Mô phỏng lớp học");

    Student s1 = new Student("trịnh", "cường");
    Student s2 = new Student("nguyễn", "khanh");
    Student s3 = new Student("khoa", "hoàng");
    Student s4 = new Student("chử", "long");
    Student s5 = new Student("nguyễn", "an");

    ArrayList<Student> students = new ArrayList<>();
    students.add(s1);
    students.add(s2);
    students.add(s3);
    students.add(s4);
    students.add(s5);

    for (Student student : students) {
      System.out.println(student);
    }

    Class lop10A2021 = new Class("10A", 2021);
    Class lop12A2021 = new Class("11A", 2021);
    System.out.println(lop10A2021);
    System.out.println(lop12A2021);
  }

}