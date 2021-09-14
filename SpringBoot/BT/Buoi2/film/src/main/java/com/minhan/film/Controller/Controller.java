package com.minhan.film.Controller;

import java.util.List;

import com.minhan.film.Model.Film;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class Controller {
    @GetMapping("films")
    public ResponseEntity<List<Film>> listFilm() {
        List<Film> list = List.of(
            new Film("Gone with the Wind","Victor Fleming, David O. Selznick",1939),
            new Film("Bố Già","Trấn Thành",2020),
            new Film("Parasite","Bong Joon-ho",2019),
            new Film("Money Heist","Álex Pina",2018)
        );
        return ResponseEntity.ok().body(list);
    }
}
