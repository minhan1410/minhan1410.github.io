import java.util.List;
import java.util.function.Function;

public class LearnFunction {
    public static void main(String[] args) {
        // 1.Tạo một danh sách(List) các object
        // Function, "function pointer"
        Function<Person, String> showNameAndEmail = person -> {
            return "Name: " + person.getName() + "- Email: " + person.getEmail();
        };
        Function<Person, String> showNameAndAge = person -> {
            return "Name: " + person.getName() + "- Age: " + person.getAge();
        };
        // Person personA = new Person("Nguyen Duc Hoang", "hoang@gmail.com", 40, "Mai Huong, Hanoi, Vietnam");
        // personA.showDetails(showNameAndEmail);
        // personA.showDetails(showNameAndAge);

        List<Person> persons = Person.generateListOfPersons();
        Person.showListOfPersons(showNameAndEmail);
    }
}
