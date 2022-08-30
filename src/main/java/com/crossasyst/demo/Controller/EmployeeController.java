package com.crossasyst.demo.Controller;

import com.crossasyst.demo.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping(value = "/Employees/{EmployeeID}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> getEmployee(@PathVariable long EmployeeID){
        Employee employee=new Employee("Rakesh", "Chavan");
        return new ResponseEntity<>(employee, HttpStatus.OK);

    }



}
