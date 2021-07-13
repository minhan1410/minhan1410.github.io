import java.util.ArrayList;
import java.util.List;

public class BookStore<T extends Book> {
    List<T> bookStore = new ArrayList<T>();

    public void Add(T v) {
        bookStore.add(v);
    }

    public void Update(T v, int pos) {
        if (pos < bookStore.size()) {
            bookStore.set(pos, v);
        } else {
            bookStore.add(v);
        }
    }

    public void removeBook(T v) {
        bookStore.remove(v);
    }

    public void Show() {
        System.out.println();
        for (int i = 0; i < bookStore.size(); i++) {
            System.out.println("Stt: "+i+" - "+bookStore.get(i));
        }
        System.out.println();
    }
}
