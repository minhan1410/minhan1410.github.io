package com.example.lamlai.Controller;

import com.example.lamlai.Model.Book;
import com.example.lamlai.Repository.BookDao;
import com.example.lamlai.Request.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/")
public class BookController {
    @Autowired
    private BookDao bookDao;

    @GetMapping
    public String listAll(Model model) {
        model.addAttribute("books", bookDao.getAll());
        return "allbooks";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("book",new Book());
        return "form";
    }

    @GetMapping(value = "/{id}")
    public String getById(@PathVariable("id") int id, Model model){
        Optional<Book> optional = bookDao.get(id);
        if(optional.isPresent()) {
            model.addAttribute("book",optional.get());
        }
        return "book";
    }

    @PostMapping("/save")
    public String save(Book book, BindingResult result, RedirectAttributes redirect){
        if(result.hasErrors()){
            return "form";
        }
        if(book.getId()>0){
            bookDao.update(book);
        }else{
            bookDao.add(book);
        }
        return "redirect:/";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteById(@PathVariable("id") int id){
        bookDao.deleteByID(id);
        return "redirect:/";
    }

    @GetMapping(value = "/edit/{id}")
    public String editBookId(@PathVariable("id") int id,Model model){
        Optional<Book> optional = bookDao.get(id);
        if(optional.isPresent()){
            model.addAttribute("book",bookDao.get(id));
        }
        return "form";
    }

    @GetMapping("/search")
    public String searchForm(Model model) {
        model.addAttribute("searchrequest", new SearchRequest());
        return "search";
    }
    @PostMapping("/search")
    public String searchByKeyword(@ModelAttribute SearchRequest request, BindingResult bindingResult, Model model) {
        if (!bindingResult.hasFieldErrors()) {
            model.addAttribute("books", bookDao.searchByKeyword(request.getKeyword()));
        }
        return "allbooks";
    }
}
