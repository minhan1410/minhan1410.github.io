package vn.techmaster;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void demoMap(){
        Map<Integer, String> person = new HashMap<>();

        // Inserting the Elements
        person.put(1, "Steve Rogers");
        person.put(2, "Loki Laufeyson");
        person.put(3, "Tony Stark");
        person.put(4, "Wanda Maximoff");

        System.out.println(person);

        person.put(3, "Peter Parker");
        System.out.println("After update: " + person);

        //remove element
        person.remove(2);
        System.out.println("After remove: " +person);

        // show map using method keySet()
        for (Map.Entry<Integer, String> entry : person.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
