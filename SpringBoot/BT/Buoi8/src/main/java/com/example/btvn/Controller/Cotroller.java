package com.example.btvn.Controller;

import com.example.btvn.Model.Employee;
import com.example.btvn.Repository.EmployeeDao;
import com.example.btvn.Request.StringRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class Cotroller {
    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping
    public String getAll(Model model){
        model.addAttribute("stringRequest",new StringRequest());
        model.addAttribute("employees",employeeDao.getAll());
        return "all";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("stringRequest",new StringRequest());
        model.addAttribute("employee",new Employee());
        return "form";
    }

    @PostMapping("/save")
    public String save(Employee employee, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            return "form";
        }
        if(employee.getId()>0){
            employeeDao.update(employee);
        }else{
            employeeDao.add(employee);
        }
        return "redirect:/";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") int id, Model model){
        model.addAttribute("stringRequest",new StringRequest());
        if(employeeDao.get(id).isPresent()){
            model.addAttribute("employee",employeeDao.get(id).get());
        }
        return "employee";
    }

    @GetMapping("update/{id}")
    public String updateById(@PathVariable("id") int id, Model model){
        model.addAttribute("stringRequest",new StringRequest());
        if(employeeDao.get(id).isPresent()){
            model.addAttribute("employee",employeeDao.get(id).get());
        }
        return "form";
    }

    @GetMapping("delete/{id}")
    public String deleteById(@PathVariable("id") int id){
        employeeDao.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/search")
    public String search(Model model){
        return "/";
    }

    @PostMapping("/search")
    public String search(@ModelAttribute StringRequest stringRequest,BindingResult bindingResult,Model model){
        model.addAttribute("stringRequest",new StringRequest());

        if(!bindingResult.hasErrors()){
            model.addAttribute("employees",employeeDao.searchByKeyword(stringRequest.getStr()));
        }
        return "all";
    }
}
