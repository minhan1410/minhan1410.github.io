import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;

public class Id609_Find_Duplicate_File_in_System {
    public static List<List<String>> findDuplicate(String[] paths) {
        // 37 ms 48.6 MB
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String string : paths) {
            String[] directory = string.split("\\s");
            for (int i = 1; i < directory.length; i++) {
                int open = directory[i].indexOf("(");
                int close = directory[i].indexOf(")");

                String content = directory[i].substring(open + 1, close);
                StringBuffer sb = new StringBuffer();

                sb.append(directory[0]);
                sb.append("/");
                sb.append(directory[i].substring(0, open));

                List<String> values = new ArrayList<String>();
                if (map.containsKey(content)) {
                    values = map.get(content);
                }

                values.add(sb.toString());
                map.put(content, values);
            }
        }

        return map.values().stream().filter(l -> l.size() > 1).collect(Collectors.toList());

        // List<List<String>> result = new ArrayList<List<String>>();
        // for (String key : map.keySet()) {
        // if(map.get(key).size() > 1){
        // result.add(map.get(key));
        // }
        // }

        // return result;
    }

    public static void main(String[] args) {
        for (List<String> list : findDuplicate(new String[] { "root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)",
                "root/c/d 4.txt(efgh)", "root 4.txt(efgh)" })) {
            System.out.print(list + ", ");
        }
        System.out.println("\n");
        for (List<String> list : findDuplicate(
                new String[] { "root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)" })) {
            System.out.print(list + ", ");
        }
        System.out.println("\n");
        for (List<String> list : findDuplicate(new String[] { "root/a 1.txt(abcd) 2.txt(efsfgh)",
                "root/c 3.txt(abdfcd)", "root/c/d 4.txt(efggdfh)" })) {
            System.out.print(list + ", ");
        }
    }
}
