package com.minhan.car.Controller;

import com.minhan.car.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {
    @Autowired
    private CarRepository cars;

    @GetMapping("/")
    public String getAll(Model model){
        model.addAttribute("cars", cars.getAll());
        return "home";
    }
}
