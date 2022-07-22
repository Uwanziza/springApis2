package com.java.springApis2.Controller;

import com.java.springApis2.Model.Employee;
import com.java.springApis2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    //@GetMapping
   //public List<Employee>getAllEmloyees(){
   //return employeeRepository.findAll();


}



