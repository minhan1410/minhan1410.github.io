import java.util.ArrayList;

public class PersonController<T extends Person> {
    private ArrayList<T> list = new ArrayList<T>();

    public void add(T person) {
        list.add(person);
    }

    public void show() {
        list.forEach(System.out::println);
        System.out.println();
    }

    public long DanhSachSv() {
        return list.stream().filter(sv -> sv.getClass().equals(new Student("", 0, "", "", 0).getClass())).count();
    }
}
