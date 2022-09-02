package com.crossasyst.demo.Controller;

import com.crossasyst.demo.model.Employee;
import com.crossasyst.demo.service.EmployeeResponse;
import com.crossasyst.demo.service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeServices employeeServices;
    private EmployeeResponse employeeResponse;

  /*  @GetMapping(value = "/Employees/{EmployeeID}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Employee>> getEmployee(@PathVariable Long EmployeeID) {
        //Employee employee = new Employee("Rakesh", "Chavan");

        Employee employee=employeeServices.getEmployee(1L);
        return new ResponseEntity<>(employeeServices.getmoreEmployee(), HttpStatus.OK);
    }*/

    @PostMapping(value = "/employees", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeResponse> createEmployees(@RequestBody Employee employee) {
        EmployeeResponse employeeResponse = employeeServices.createEmployee(employee);
        return new ResponseEntity<>(employeeResponse, HttpStatus.OK);
    }


}















/* @GetMapping(value = "/employees/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
 @CrossOrigin(origins = "*")
    ResponseEntity<List<Employee>> getEmployee(@PathVariable Long id){
    List<Employee> employee=employeeServices.getmoreEmployee();
    return new ResponseEntity<>()
 }*/



   /* @GetMapping(value = "/Employees/{EmployeeID}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> getEmployee(@PathVariable long EmployeeID){
        Employee employee=new Employee("Rakesh", "Chavan");
        return new ResponseEntity<>(employee, HttpStatus.OK);

    }*/
