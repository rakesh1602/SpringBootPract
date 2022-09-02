package com.crossasyst.demo.service;


import com.crossasyst.demo.model.Employee;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Log4j2
public class EmployeeServices {
    public Employee getEmployee(Long employeeId) {
        Employee employee = new Employee("Rakesh", "Chavan");
        return employee;
    }

    public EmployeeResponse createEmployee(Employee employee) {
        long id = (long) (Math.random() * 10);
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setId(id);
        log.info("Employee Name is{}{}", employee.getFirstName(), employee.getLastName());
        return employeeResponse;
    }


    public List<Employee> getmoreEmployee() {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Rakesh", "Chavan"));
        list.add(new Employee("Uttam", "Thakre"));
        return list;
    }

   /* public List<Employee> getEmployeeById(Long employeeId){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Rakesh", "Chavan"));
        list.add(new Employee("Uttam", "Thakre"));
        list.add(new Employee("Suchit", "Khadtar"));
        if (employeeId != null){

        }else {

        }
        return list;
    }*/






}
