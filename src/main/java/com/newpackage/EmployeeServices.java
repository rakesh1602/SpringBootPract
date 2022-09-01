package com.newpackage;


import com.crossasyst.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeServices {
    public Employee getEmployee(Long employeeId) {
        Employee employee = new Employee("Rakesh", "Chavan");
        return employee;
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
