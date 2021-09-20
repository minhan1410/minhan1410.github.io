package com.minhan.bookstore.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.minhan.bookstore.Model.Book;
import org.springframework.stereotype.Repository;

@Repository
/*
 * Mục đích sử dụng của @Repository là để áp dụng trên các DAO(Data Access
 * Object) class dùng để thao tác với database.
 *
 * @Repository annotation có một vai trò đặc biệt dùng để chuyển đổi các
 * database exception sang Spring-based (Các exception mà Spring có thể hiểu và
 * xử lý được) unchecked exception.
 */
public class BookDao {
    private ArrayList<Book> books;

    public BookDao() {
        books = new ArrayList<Book>(
                List.of(new Book(1, "Không gia đình", "Chú bé Remy lang thang theo gánh xiếc của bác Vitaly"),
                        new Book(2, "Cuốn theo chiều gió", "Nội chiến Hoa kỳ, cuộc tình giữa Red Butler và Ohara"),
                        new Book(3, "Không có tiền", "Bạn An không có tiền mua điện thoại, máy tinh mới")));
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public Optional<Book> get(Integer id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst();
    }

    public void update(Book t) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(t.getId())) {
                books.set(i, t);
            }
        }
    }

    public void deleteByID(Integer id) {
        Optional<Book> book = get(id);
        if (book.isPresent() && books.size() >= 1) {
            books.remove(book.get());
        }
    }

    public void delete(Book t) {
        deleteByID(t.getId());
    }

    public void add(Book t) {
        Optional<Book> book = get(t.getId());
        if (!book.isPresent()) {
            books.add(t);
        }
    }
}
