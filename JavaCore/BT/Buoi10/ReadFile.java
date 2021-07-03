import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ReadFile {
    public static ArrayList<Teacher> TeacherData() throws IOException {
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        FileReader reader = null;
        Gson gson = new Gson();

        try {
            reader = new FileReader("D:\\Techmaster\\minhan1410.github.io\\JavaCore\\BT\\Buoi10\\Teachers_Data.json");
            teachers = gson.fromJson(reader, new TypeToken<ArrayList<Teacher>>() {}.getType());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            reader.close();
        }
        return teachers;
    }

    public static ArrayList<Student> StudentData() throws IOException {
        ArrayList<Student> students = new ArrayList<Student>();
        FileReader reader = null;
        Gson gson = new Gson();

        try {
            reader = new FileReader("D:\\Techmaster\\minhan1410.github.io\\JavaCore\\BT\\Buoi10\\Students_Data.json");
            students = gson.fromJson(reader, new TypeToken<ArrayList<Student>>() {}.getType());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            reader.close();
        }
        return students;
    }
}
