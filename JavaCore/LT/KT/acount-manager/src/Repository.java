import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Repository {
    private List<User> users;

    public List<User> getData() {
        try {
            FileReader reader = new FileReader(
                    "D:\\Techmaster\\minhan1410.github.io\\JavaCore\\LT\\KT\\acount-manager\\acount.json");

            // Chuyển từ JSON text -> object
            Type objectType = new TypeToken<List<User>>() {
            }.getType();
            users = new Gson().fromJson(reader, objectType);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return users;
    }
}
