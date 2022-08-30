package com.crossasyst.demo.Controller;

import com.crossasyst.demo.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping(value ="/students/{studentId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> getStudent(@PathVariable long studentId) {
        Student std = new Student("rakesh", "chavan", "duhgdfgbe iuehwfbuiwe gwiuewbfweuibf vusdibuwefbuiweuif ");
//        std.getFirstName();
//        std.getLastName();
//        std.getAddress();

        return new ResponseEntity<>(std, HttpStatus.OK);
    }
}
