package com.decoder135.demo.rest;

import com.decoder135.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    // define @PostConstruct to load the student data...only once!

    @PostConstruct
    public void loadStudentData() {
        theStudents = new ArrayList<>();

        theStudents.add(new Student("Devansh", "Shukla"));
        theStudents.add(new Student("Vishad", "Vashishtha"));
        theStudents.add(new Student("Ashutosh", "Chaubey"));
    }

    // define an endpoint for "/students" - return a list of students

    @GetMapping("/students")
    public List<Student> getStudents() {
        return theStudents;
    }

    // define endpoint for "/students/{studentId}" - return student at index

    @GetMapping("/students/{studentId}")
    public Student getStudentDetailsById(@PathVariable int studentId) {

        // just index into the list...keep it simple for now

        return theStudents.get(studentId);
    }
}
