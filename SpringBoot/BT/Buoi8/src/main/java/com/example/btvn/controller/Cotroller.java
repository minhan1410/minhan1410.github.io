package com.example.btvn.controller;

import com.example.btvn.model.Employee;
import com.example.btvn.repository.EmployeeDao;
import com.example.btvn.request.StringRequest;
import com.example.btvn.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class Cotroller {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private StorageService storageService;

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("stringRequest", new StringRequest());
        model.addAttribute("employees", employeeDao.getAll());
        return "all";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("stringRequest", new StringRequest());
        model.addAttribute("employee", new Employee(employeeDao.getLength() + 1, null, null, null, null));
        return "form";
    }

    @PostMapping(value = "/save", consumes = {"multipart/form-data"})
    public String save(@Valid @ModelAttribute Employee employee, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (employee.getPhoto().getOriginalFilename().isEmpty()) {
            bindingResult.addError(new FieldError("person", "photo", "Ảnh không được để trông"));
        }

        if (bindingResult.hasErrors()) {
            model.addAttribute("stringRequest", new StringRequest());
            model.addAttribute("employee", employee);
            return "form";
        }

        storageService.uploadFile(employee.getPhoto(), String.valueOf(employee.getId()));

        if (employee.getId() <= employeeDao.getLength()) {
            employeeDao.update(employee);
        } else {
            employeeDao.add(employee);
        }
        return "redirect:/";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") int id, Model model) {
        model.addAttribute("stringRequest", new StringRequest());
        if (employeeDao.get(id).isPresent()) {
            model.addAttribute("employee", employeeDao.get(id).get());
        }
        return "employee";
    }

    @GetMapping("update/{id}")
    public String updateById(@PathVariable("id") int id, Model model) {
        model.addAttribute("stringRequest", new StringRequest());
        if (employeeDao.get(id).isPresent()) {
            model.addAttribute("employee", employeeDao.get(id).get());
        }
        return "form";
    }

    @GetMapping("delete/{id}")
    public String deleteById(@PathVariable("id") int id) {
        employeeDao.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/search")
    public String search(Model model) {
        return "/";
    }

    @PostMapping("/search")
    public String search(@ModelAttribute StringRequest stringRequest, BindingResult bindingResult, Model model) {
        model.addAttribute("stringRequest", new StringRequest());

        if (!bindingResult.hasErrors()) {
            model.addAttribute("employees", employeeDao.searchByKeyword(stringRequest.getStr()));
        }
        return "all";
    }
}
