package vn.techmaster.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.techmaster.bookstore.model.Book;
import vn.techmaster.bookstore.repository.BookDao;

import java.util.Optional;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookDao bookDao;

    @GetMapping
    public String listAll(Model model) {
        model.addAttribute("books", bookDao.getAll());
        return "allbooks";
    }

    @GetMapping("/getId")
    public String getId(int id, Model model) {
        Optional<Book> book =bookDao.get(id);
        if(book.isPresent()){
            model.addAttribute("book", book.get());
            return "search";
        }
        return "Null";
    }

    @PostMapping("/add")
    public String addBook(Book t, Model model) {
        bookDao.add(t);
        return listAll(model);
    }

    @PatchMapping("/update")
    public String updateBook(Book t, Model model) {
        bookDao.update(t);
        return listAll(model);
    }

    @DeleteMapping("/deleteByID")
    public String deleteByID(int id, Model model) {
        bookDao.deleteByID(id);
        return listAll(model);
    }
}
