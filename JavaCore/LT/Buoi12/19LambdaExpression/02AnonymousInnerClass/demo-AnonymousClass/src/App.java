import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App{
    public static void main(String[] args) throws Exception {
        AnonymousInnerClassDemo demo = new AnonymousInnerClassDemo(){

            @Override
            public void methodInClass() {
                System.out.println("Đây là phương thức của lớp vô danh");
                
            }
            
        };

        demo.methodInClass(); //Gọi tới phương thức của lớp vô danh


        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("John", 35, "England"));
        persons.add(new Person("Peter", 25, "American"));
        persons.add(new Person("Anna",27, "Russia"));
        persons.add(new Person("Olivia", 32, "Russia"));

        System.out.println("Danh sách ban đầu: ");
        for (Person person : persons) {
            System.out.println(person);
        }

        
        Collections.sort(persons, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
            
        });
        System.out.println("Danh sách sau khi sắp xếp theo tên: ");
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}
