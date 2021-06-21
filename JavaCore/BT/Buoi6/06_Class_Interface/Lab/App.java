import java.time.LocalDate;

import MyMath.Vector;  //import package này

public class App {
  public static void main(String[] args) {
    System.out.println("Hello Class");
    demoPerson();
    //demoMyMath();
    BaoVeTaiNang bvtn = new BaoVeTaiNang();
    System.out.println(ISecurity.BADGET); 
    System.out.println(bvtn.KEY); 

  }

  public static void demoPerson() {
    Person person = new Person(); //Dùng constructor không tham số
    person.firstName = "Bill";  //Gán từng thuộc tính.
    person.lastName = "Gates";  //Nếu class có 10 thuộc tính thì cần 10 lệnh
    person.birthday = LocalDate.of(1970, 11, 02);
    System.out.println(person);

    // Sử dụng constructor có tham số truyền vào để tạo ra đối tượng
    Person steveJobs = new Person("Steve", "Jobs", LocalDate.of(1969, 10, 02));
    System.out.println(steveJobs);

    HardWorkPerson elonMusk = new HardWorkPerson("Elon", "Musk", LocalDate.of(1972, 8, 2));
    elonMusk.work();

    Person person2 = new Person("Bill", "Gates", LocalDate.of(1970, 11, 03));
    //Person person2 = person;

    if (person.equals(person2)) {
      System.out.println("Hai đối tượng này giống nhau");
    }

    if (person == person2) {
      System.out.println("Hai đối tượng này là một");
    }

    if (person.hashCode() == person2.hashCode()) {
      System.out.println("Hai đối tượng có hash code giống nhau");
    } else {
      System.out.println("Hai đối tượng có hash code khác nhau");
    }
  }
  public static void demoMyMath() {
    Vector vector = new Vector(3, 4);
    System.out.println(vector.x);
    
  }
}