package com.eduhub.eduhub_backend.controller;

import com.eduhub.eduhub_backend.component.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("Student")
    public ResponseEntity<?> getStudent() {
        Student student = new Student(1, "Saai", "S");
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("student")
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Saai", "S"));
        students.add(new Student(2, "Sai", "S"));
        students.add(new Student(3, "Saa", "S"));
        students.add(new Student(4, "raai", "S"));
        return new ResponseEntity<>(students, HttpStatus.OK);


    }
}
