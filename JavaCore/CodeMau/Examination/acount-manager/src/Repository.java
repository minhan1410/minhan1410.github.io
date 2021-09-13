import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Repository {
    public List<User> users;
    public List<User> getData(){
        try {
            FileReader reader = new FileReader("acount.json");

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
