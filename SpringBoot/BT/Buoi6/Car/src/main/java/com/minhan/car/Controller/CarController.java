package com.minhan.car.Controller;

import com.minhan.car.Exception.ShowException;
import com.minhan.car.Model.Car;
import com.minhan.car.Repository.CarRepository;
import com.minhan.car.Request.IdRequest;
import com.minhan.car.Request.StringRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.*;

@Controller
public class CarController {
    @Autowired
    private CarRepository cars;

    @GetMapping("/")
    public ResponseEntity<List<Car>> getAll() {
        return ResponseEntity.ok().body(cars.getAll());
    }


    @PostMapping("/add")
    public ResponseEntity<List<Car>> add ( @Valid Car car, BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            cars.add(car);
        }
        return getAll();
    }

    @GetMapping("/search")
    public ResponseEntity<Set<Car>> search(@Valid String str, BindingResult bindingResult) {
        Set<Car> set = new LinkedHashSet<>();
        if (!bindingResult.hasErrors()) {
            set.addAll(cars.searchManufacturer(str));
            set.addAll(cars.searchModel(str));
            set.addAll(cars.searchPrice(str));
        }
        return ResponseEntity.ok().body(set);
    }

    @GetMapping("/update")
    public ResponseEntity<List<Car>> update(@Valid Car car, BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            cars.update(car);
        }
        return getAll();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }


//    @GetMapping("/car/delete/{id}")
//    public String deleteById(@PathVariable("id") int id, Model model) {
//        cars.deleteByID(id);
//        return getAll(model);
//    }
//
//    @GetMapping("/car/{id}")
//    public String getId(@PathVariable("id") int id, Model model) {
//        model.addAttribute("stringRequest", new StringRequest());
//
//        Optional<Car> car = cars.get(id);
//        if (car.isPresent()) {
//            model.addAttribute("car", car.get());
//            return "get";
//        }
//        return "null";
//    }
//
//    //    Hiển thị lỗi
//    @ExceptionHandler(ShowException.class)
//    public String handleStorageFileNotFound(ShowException e, Model model) {
//        model.addAttribute("errorMessage", e.getMessage());
//        return failure(model);
//    }
//
//    @GetMapping("/failure")
//    public String failure(Model model) {
//        model.addAttribute("stringRequest", new StringRequest());
//        return "failure";
//    }
}
