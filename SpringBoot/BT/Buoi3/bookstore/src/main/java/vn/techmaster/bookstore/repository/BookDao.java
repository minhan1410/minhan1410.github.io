package vn.techmaster.bookstore.repository;

import java.util.List;
import java.util.Optional;

import vn.techmaster.bookstore.model.Book;


public class BookDao extends Dao<Book> {

    public BookDao() {
        collections.add(new Book(1, "Không gia đình", "Chú bé Remy lang thang theo gánh xiếc của bác Vitaly"));
        collections.add(new Book(2, "Cuốn theo chiều gió", "Nội chiến Hoa kỳ, cuộc tình giữa Red Butler và Ohara"));
    }

    @Override
    public List<Book> getAll() {
        return collections;
    }

    @Override
    public Optional<Book> get(int id) {
        // TODO Auto-generated method stub
        return collections.stream().filter(book -> book.getId() == id).findFirst();
    }

    @Override
    public void add(Book t) {
        // TODO Auto-generated method stub
        boolean flag = get(t.getId()).isPresent(); //Trả lại true nếu có một giá trị hiện tại, nếu không false.
        if (!flag) {
            collections.add(t);
        }
    }

    @Override
    public void update(Book t) {
        // TODO Auto-generated method stub
        for (int i = 0; i < collections.size(); i++) {
            if(collections.get(i).getId() == t.getId()){
                collections.set(i,t);
            }
        }
    }

    @Override
    public void deleteByID(int id) {
        // TODO Auto-generated method stub
        boolean flag = get(id).isPresent();
        if(flag && collections.size() >= 1){
            collections.remove(get(id).get());
        }
    }

    @Override
    public void delete(Book t) {
        // TODO Auto-generated method stub
        deleteByID(t.getId());
    }
}