import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static Map<String, Integer> CoutCountry(List<Person> list) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (Person person : list) {
            if (!map.containsKey(person.getCountry())) {
                map.put(person.getCountry(), 1);
            } else {
                map.put(person.getCountry(), map.get(person.getCountry()) + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {

        CoutCountry(PersonFile.ReadFile()).forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
