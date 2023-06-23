package com.example.thymeleafdemo.controller;

import com.example.thymeleafdemo.model.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.ui.Model;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
@RequestMapping("/employees")
public class EmployeeController {
    private List<Employee> theEmployees;
    @PostConstruct
    private void loadData(){
        Employee emp1 = new Employee(1,"Pham","Tai","phamtai@gmail.com");

        theEmployees = new ArrayList<>();
        theEmployees.add(emp1);

    }

    @GetMapping("/list")
    public String listEmployees(Model theModel){

        theModel.addAttribute("employees",theEmployees);
        return "list_employees";
    }
}
