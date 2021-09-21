package com.minhan.car.Controller;

import com.minhan.car.Model.Car;
import com.minhan.car.Repository.CarRepository;
import com.minhan.car.Request.IdRequest;
import com.minhan.car.Request.StringRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Controller
public class CarController {
    @Autowired
    private CarRepository cars;

    @GetMapping("/")
    public String getAll(Model model) {
        model.addAttribute("stringRequest", new StringRequest());
        model.addAttribute("cars", cars.getAll());
        return "home";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("stringRequest", new StringRequest());
        model.addAttribute("car", new Car());
        return "add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Car car, BindingResult bindingResult, Model model) {
        if (!bindingResult.hasErrors()) {
            cars.add(car);
            return getAll(model);
//            return "add";
        }
        return "null";
    }

    @GetMapping("/search")
    public String search(Model model) {
        model.addAttribute("stringRequest", new StringRequest());
        return "search";
    }

    @PostMapping("/search")
    public String search(@ModelAttribute StringRequest stringRequest, BindingResult bindingResult, Model model) {
        if (!bindingResult.hasErrors()) {
            Set<Car> set = new LinkedHashSet<>();
            set.addAll(cars.searchManufacturer(stringRequest.getStr()));
            set.addAll(cars.searchModel(stringRequest.getStr()));
            set.addAll(cars.searchPrice(stringRequest.getStr()));
            model.addAttribute("cars", set);
            return "search";
        }
        return "null";
    }

    @GetMapping("/car/edit/{id}")
    public String edit(@PathVariable("id") int id,Model model){
        model.addAttribute("stringRequest", new StringRequest());
        Optional<Car> car = cars.get(id);
        if(car.isPresent()){
            model.addAttribute("car",car.get());
            return "edit";
        }
        return "null";
    }

    @PostMapping("/car/edit/{id}")
    public String edit(@ModelAttribute Car car, BindingResult bindingResult, Model model){
        if (!bindingResult.hasErrors()) {
            cars.edit(car);
            return getAll(model);
        }
        return "null";
    }

    @GetMapping("/car/delete/{id}")
    public String deleteById(@PathVariable("id") int id,Model model){
        cars.deleteByID(id);
        return getAll(model);
    }

    @GetMapping("/car/{id}")
    public String getId(@PathVariable("id") int id,Model model){
        model.addAttribute("stringRequest", new StringRequest());

        Optional<Car> car = cars.get(id);
        if(car.isPresent()){
            model.addAttribute("car",car.get());
            return "get";
        }
        return "null";
    }
}
