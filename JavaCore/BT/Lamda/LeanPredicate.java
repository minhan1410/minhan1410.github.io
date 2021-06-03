import java.util.List;
import java.util.function.Predicate;

public class LeanPredicate {
    public static void main(String[] args) {
        // 1.Tạo một danh sách(List) các object
        List<Person> persons = Person.generateListOfPersons();
        // Sắp xếp sử dụng Predicate
        // Predicate<Person> agePredicate = person -> person.getAge() >= 32;
        Predicate<Person> agePredicate = person -> person.getAge() > 30 && person.getAge() < 40;
        List<Person> filteredPerson = PersonFilter.filterByPredicate(persons, agePredicate);
        System.out.println("List after sorted");
        for (Person person : filteredPerson) {
            person.showDetails();
        }
    }
}
