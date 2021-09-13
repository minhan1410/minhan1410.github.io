package vn.techmaster;

import java.util.Arrays;
import java.util.HashSet;


class Student {
  int id;
  String name;
  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }
}
public class DemoHashSet {
  private HashSet<Integer> uniqueNumbers;

  private HashSet<Student> uniqueStudents;
  public DemoHashSet() {
    uniqueNumbers = new HashSet<>();
    uniqueNumbers.addAll(Arrays.asList(1, 1, 2, 3, 0, 5, 8, 8, 9, 7, 6));

    System.out.println("===========\nUnique numbers");
    System.out.println(uniqueNumbers);

    uniqueStudents = new HashSet<>();
  }
  
}
