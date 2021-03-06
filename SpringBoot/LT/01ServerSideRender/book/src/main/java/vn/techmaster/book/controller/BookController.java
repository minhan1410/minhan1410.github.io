package vn.techmaster.book.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.techmaster.book.model.Book;

@Controller
@RequestMapping(value ="/")
public class BookController {
  @GetMapping("/")
  public String showHomePage(Model model) {
    model.addAttribute("name", "Jeff Bezos");
    return "index";
  }
  @GetMapping("/books")
  public String listBooks(Model model) {
    List<Book> books = List.of(
      new Book("Dế Mèn Phiêu Lưu Ký", "Tô Hoài"),
      new Book("Nhật Ký Trong Tù", "Hồ Chí Minh"),
      new Book("Tắt Đèn", "Ngô Tất Tố"),
      new Book("Ma Thổi Đèn", "Phạm Hữu Tín"),
      new Book("Đắc Nhân Tâm", "Dale Carnege")
    );
    model.addAttribute("books", books);
    return "book";
  }
}


