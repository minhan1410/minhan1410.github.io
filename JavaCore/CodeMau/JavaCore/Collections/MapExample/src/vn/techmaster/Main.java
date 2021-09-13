package vn.techmaster;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MapExample.demoMap();

        Employee employee1 = new Employee(1, "Kamado Tanjirou", "tanjirou@gmail.com", "0123456789");
        Employee employee2 = new Employee(2, "Kamado Nezuko", "nezuko@gmail.com", "0147258369");
        Employee employee3 = new Employee(3, "Rengoku Kyoujurou", "kyoujurou@gmail.com", "0741852963");
        Employee employee4 = new Employee(4, "Tomioka Giyuu", "giyuu@gmail.com", "0987654321");

        // init map
        Map<Integer, Employee> map = new HashMap<Integer, Employee>();
        map.put(employee1.getId(), employee1);
        map.put(employee2.getId(), employee2);
        map.put(employee3.getId(), employee3);
        map.put(employee4.getId(), employee4);

        // show map using method keySet()
        for (Integer key : map.keySet()) {
            Employee value = map.get(key);
            System.out.println(key + " = " + value);
        }


        System.out.println("---------------------------------------------");
        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Employee value = entry.getValue();
            System.out.println(key + " = " + value);
        }



    }
}
