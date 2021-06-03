import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Person {
    private String name;
    private String email;
    private Integer age;
    private String address;
    static List<Person> persons = new ArrayList<Person>();

    // Constructor
    public Person(String name, String email, Integer age, String address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    // getter
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Tạo ra danh sách các đối tượng Person
    public static List<Person> generateListOfPersons() {
        persons.add(new Person("Hoang", "sunlight4d@gmail.com", 35, "Mai huong, Bach Mai, Hanoi"));
        persons.add(new Person("Huong", "huong@gmail.com", 32, "Cầu giấy, Hà "));
        persons.add(new Person("Phương", "phuong4d@gmail.com", 30, "Nguyễn Đình Chiểu, Hanoi"));
        persons.add(new Person("Minh", "minh4d@gmail.com", 29, "Minh Khai, Hà Nội, Việt nam"));
        persons.add(new Person("Alexa", "alexa@gmail.com", 33, "Queensland, Australia"));
        return persons;
    }

    public void showDetails() {
        System.out.println("name :" + name + " email: " + email + " age: " + age + " address: " + address);
    }

    public void showDetails(Function<Person, String> aFunction) {
        System.out.println(aFunction.apply(this));
    }

    public static void showListOfPersons(Function<Person,String> f){
        persons.forEach(i-> System.out.println(f.apply(i)));
    }
}
