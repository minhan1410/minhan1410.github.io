import java.time.LocalDate;

import Math.Vector;

public class App {
  public static void main(String[] args) {
    demoPerson();
    //demoVector();
  }

  static void demoPerson() {
    Person person = new Person();
    person.firstName = "John";
    person.lastName = "Mayer";
    person.birthday = LocalDate.of(1965, 11, 20);
    person.sayHi();

    Person johnHopkin = new Person("John", "Hopkin", LocalDate.of(1865, 05, 20));
    System.out.println(johnHopkin);

    HardworkPerson elonMusk = new HardworkPerson("Elon", "Musk", LocalDate.of(1972, 05, 20));
    elonMusk.work();
  }

  static void demoVector() {
    Vector vector = new Vector();
   // vector.x = 10;
   // vector.y = 11;
  }
}