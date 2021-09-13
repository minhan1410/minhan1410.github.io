import java.util.ArrayList;

public class Number {
  public void demoNumber() {
    int i = 0;
    float pi = 3.14159f;
    i = (int) pi;
     System.out.println("i = " + i);

    long primitiveLong = 10L; //Không thể gán null
    Long objectLong = null;  //Có thể gán null
    System.out.println("primitiveLong = " + primitiveLong);
    System.out.println("objectLong = " + objectLong);
    objectLong = primitiveLong;
    System.out.println("objectLong = " + objectLong);

    ArrayList<Long> numbers = new ArrayList<>(); //Không thể ArrayList<long> numbers
    numbers.add(1L);
    numbers.add(2L);
    numbers.add(3L);
    System.out.println(numbers);
  }

  public void compareFloatNumbers() {
    double a = 1.4142135623f;
    double b = Math.sqrt(2.0);
    if (a == b) {  // This is dangerous comparison
      System.out.println("hai số bằng nhau");
    } else {
      System.out.println("hai số không bằng nhau");
    }
  }
}
