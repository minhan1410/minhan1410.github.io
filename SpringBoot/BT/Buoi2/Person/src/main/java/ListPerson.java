import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListPerson {
    List<Person> list;

    public ListPerson() {
        list = ReadFile.GetFile();
    }

    public List<Person> filterAge() {
        return list.stream().filter(i -> i.getAge() >= 20 && i.getAge() <= 30).toList();
    }

    public double avgAgeAll() {
        return list.stream().collect(Collectors.averagingDouble(i -> i.getAge()));
    }

    public Map<String, Double> avgAgeGroupNationality() {
        return list.stream().collect(Collectors.groupingBy(Person::getNationality, Collectors.averagingDouble(Person::getAge)));
    }
}
