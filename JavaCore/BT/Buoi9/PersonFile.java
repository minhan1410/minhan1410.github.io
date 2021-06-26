import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class PersonFile {
    public static List<Person> ReadFile() {
        Gson gson = new Gson();
        List<Person> list=new ArrayList<Person>();
        FileReader fileReader = null;
        try {

            fileReader = new FileReader("D:\\Techmaster\\minhan1410.github.io\\JavaCore\\BT\\Buoi9\\Person_DATA.json");
            list = gson.fromJson(fileReader, new TypeToken<List<Person>>() {}.getType());

        } catch (Exception e) {
            System.out.println("Loi: " + e.getMessage());
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return list;
    }
}
