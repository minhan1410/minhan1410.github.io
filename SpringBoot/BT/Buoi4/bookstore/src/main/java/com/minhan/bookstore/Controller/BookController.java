package com.minhan.bookstore.Controller;

import com.minhan.bookstore.Model.Book;
import com.minhan.bookstore.Repository.BookDao;
import com.minhan.bookstore.Request.IdRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    private BookDao books;

    @GetMapping("/")
    public String getHome() {
        return "index";
    }

    @GetMapping("/getAll")
    public String getAll(Model model) {
        model.addAttribute("books", books.getBooks());
        return "getAll";
    }

    @GetMapping("/getbyid")
    public String getId(Model model) {
        model.addAttribute("book", null);
        model.addAttribute("idRequest", new IdRequest());
        return "getById";
    }

    @PostMapping("/getbyid")
    public String getId(@ModelAttribute IdRequest idRequest, BindingResult bindingResult, Model model) {
        if (!bindingResult.hasErrors()) {
            model.addAttribute("IdRequest", idRequest);
            Optional<Book> book = books.get(idRequest.getId().intValue());
            if (book.isPresent()) {
                model.addAttribute("book", book.get());
                return "getById";
            }
        }
        return "null";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("newBook",new Book());
        return "add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Book newBook, BindingResult bindingResult, Model model) {
        if (!bindingResult.hasErrors()) {
            books.add(newBook);
            return getAll(model);
        }
        return "null";
    }

    @GetMapping("/update")
    public String update(Model model) {
        model.addAttribute("updateBook", new Book());
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Book updateBook, BindingResult bindingResult, Model model) {
        if (!bindingResult.hasErrors()) {
            books.update(updateBook);
            return getAll(model);
        }
        return "null";
    }

    @GetMapping("/deletebyid")
    public String deleteById( Model model) {
        model.addAttribute("idRequest", new IdRequest());
        return "deletebyid";
    }

    @PostMapping("/deletebyid")
    public String deleteById(@ModelAttribute IdRequest idRequest, BindingResult bindingResult, Model model) {
        books.deleteByID(idRequest.getId());
        return getAll(model);
    }

    @GetMapping("/delete")
    public String delete(Model model) {
        model.addAttribute("deleteBook", new Book());
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Book deleteBook, BindingResult bindingResult, Model model) {
        books.delete(deleteBook);
        return getAll(model);
    }
}
