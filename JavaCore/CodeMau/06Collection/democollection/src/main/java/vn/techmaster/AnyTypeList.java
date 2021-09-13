package vn.techmaster;

import java.util.ArrayList;
import java.util.List;
class Student {
  String name;
  float averageScore;
  public Student(String name, float averageScore) {
    this.name = name;
    this.averageScore = averageScore;
  }

  @Override
  public String toString() {
    return this.name + " : " + this.averageScore;
  }
}
public class AnyTypeList {
  private List<Object> anyTypedList = new ArrayList<>();

  public AnyTypeList() {
    anyTypedList.add("Hello");
    anyTypedList.add(1);
    anyTypedList.add(1.6);
    anyTypedList.add(10L);
    anyTypedList.add(1==1);
    anyTypedList.add(new Student("Trịnh Minh Cường", 7.85f));
    
  }

  public void listItemAndType() {
    anyTypedList.forEach(item -> {
      System.out.println(item.getClass() + " " + item.toString());
    });
  }
}
