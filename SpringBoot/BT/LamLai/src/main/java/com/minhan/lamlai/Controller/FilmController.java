package com.minhan.lamlai.Controller;

import com.minhan.lamlai.Model.Film;
import com.minhan.lamlai.Repository.FilmDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping
public class FilmController {
    @Autowired
    private FilmDao filmDao;

    @GetMapping("/")
    public String getAll(Model model){
        model.addAttribute("films",filmDao.getAll());
        return "home";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") int id, Model model){
        model.addAttribute("film",filmDao.getById(id).get());
        return "film";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("film",new Film());
        return "form";
    }

    @PostMapping("/save")
    public String save(Film film, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            return "form";
        }
        if(film.getId()>0){
            filmDao.update(film);
        }else{
            filmDao.add(film);
        }
        return "redirect:/";
    }

    @GetMapping("update/{id}")
    public String updateById(@PathVariable("id") int id, Model model){
        if(filmDao.getById(id).isPresent()){
            model.addAttribute("film",filmDao.getById(id).get());
        }
        return "form";
    }

    @GetMapping("delete/{id}")
    public String deleteById(@PathVariable("id") int id){
        filmDao.deleteById(id);
        return "redirect:/";
    }
}
