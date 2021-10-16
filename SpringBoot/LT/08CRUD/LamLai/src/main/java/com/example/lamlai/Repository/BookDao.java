package com.example.lamlai.Repository;

import com.example.lamlai.Model.Book;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class BookDao extends Dao<Book> {
    @Override
    public List<Book> getAll() {
        return collections;
    }

    @Override
    public Optional<Book> get(int id) {
        return collections.stream().filter(i -> i.getId() == id).findFirst();
    }

    @Override
    public void add(Book book) {
        int id;
        if (collections.isEmpty()) {
            id = 1;
        } else {
            id = collections.get(collections.size() - 1).getId() + 1;
        }
        book.setId(id);
        collections.add(book);
    }

    @Override
    public void update(Book book) {
        get(book.getId()).ifPresent(i -> {
            i.setTitle(book.getTitle());
            i.setDescription(book.getDescription());
        });
    }

    @Override
    public void deleteByID(int id) {
        get(id).ifPresent(i -> collections.remove(i));
    }

    @Override
    public void delete(Book book) {
        deleteByID(book.getId());
    }

    @Override
    public List<Book> searchByKeyword(String keyword) {
        //Tham khảo chi tiết ở đây nhé. Đây là Lambda Expression có từ Java 8.
        //https://www.baeldung.com/java-stream-filter-lambda
        return collections
                .stream()
                .filter(book -> book.matchWithKeyword(keyword))
                .collect(Collectors.toList());
    }
}
