import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Person> GetFile() {
        Gson gson = new Gson();
        List<Person> list = new ArrayList<Person>();
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("D:\\Techmaster\\minhan1410.github.io\\SpringBoot\\BT\\Buoi2\\Person\\src\\main\\resources\\static\\person.json");
            list = gson.fromJson(fileReader, new TypeToken<List<Person>>() {
            }.getType());
        } catch (Exception e) {
            System.out.println("Loi doc file " + e.getMessage());
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
