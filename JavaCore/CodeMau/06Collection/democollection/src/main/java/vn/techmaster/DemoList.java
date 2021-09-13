package vn.techmaster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoList {
  private List<String> listString;

  public DemoList() {
    listString = new ArrayList<>();
    //initListByAdd();
    initListFromArray();
  }
  //Khởi tạo ArrayList bằng các thêm từng phần tử
  public void initListByAdd() {
    listString.add("John");
    listString.add("Jimmy");
    listString.add("Henry");
    listString.add("Thuý");
    listString.add("Đào");
    listString.add("Hương");
  }

  //Khởi tạo ArrayList qua Arrays.asList
  public void initListFromArray() {
    listString = Arrays.asList("John", "Jimmy", "Henry", "Thuý", "Đào", "Hương");
  }

  public void simpleForLoop() {
    System.out.println("=========\n1.Simple for loop");
    for (int i = 0; i < listString.size(); i++) {
      System.out.println(i + " " + listString.get(i));
    }
  }

  public void enhanceForLoop() {
    System.out.println("=========\n2. Enhance for loop");
    // Dùng khi không cần biến đếm
    for (String item : listString) {
      System.out.println(item);
    }
  }

  public void iteratorLoop() {
    System.out.println("=========\n3. Iterator for loop");
    Iterator<String> iterator = listString.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
      
    }
  }

  // Xem khác biệt giữa iterator vs ListIterator ở đây

  public void listIteratorLoop() {
    System.out.println("=========\n4. List Iterator for loop");
    ListIterator<String> iterator = listString.listIterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

  public void listIteratorBackward() {
    System.out.println("=========\n5. List Iterator backward loop");
    ListIterator<String> iterator = listString.listIterator(listString.size());
    while (iterator.hasPrevious()) {
      System.out.println(iterator.previous());
    }
  }

  public void whileLoop() {
    System.out.println("=========\n6. While Loop");
    int i = 0;
    while (i < listString.size()) {
      System.out.println(listString.get(i));
      i++;
    }
  }

  public void forEachLoopA() {
    System.out.println("=========\n7a. For Each Loop A");
    listString.forEach(System.out::println);
  }

  public void forEachLoopB() {
    System.out.println("=========\n7B. For Each Loop B");
    listString.forEach(item -> {
      System.out.println(item);
    });
  }

  public void streamForEach() {
    System.out.println("=========\n8. Stream For Each Loop");
    listString.stream().forEach(item -> {
      System.out.println(item);
    });
  }
}