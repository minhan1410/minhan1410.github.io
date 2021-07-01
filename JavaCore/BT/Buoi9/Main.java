import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static Map<String, Integer> CoutCountry(List<Person> list) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String k;
        for (Person person : list) {
            k = person.getCountry();
            if (!map.containsKey(k)) {
                map.put(k, 1);
            } else {
                map.put(k, map.get(k) + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {

        CoutCountry(PersonFile.ReadFile()).forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
