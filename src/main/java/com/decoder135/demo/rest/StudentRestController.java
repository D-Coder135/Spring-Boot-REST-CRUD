package com.decoder135.demo.rest;

import com.decoder135.demo.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    // define an endpoint for "/students" - return a list of students

    public List<Student> getStudents() {
        return null;
    }
}
