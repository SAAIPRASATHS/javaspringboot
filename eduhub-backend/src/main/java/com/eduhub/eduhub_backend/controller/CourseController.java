package com.eduhub.eduhub_backend.controller;

import com.eduhub.eduhub_backend.component.Course;
import com.eduhub.eduhub_backend.component.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    // Get all courses

    @GetMapping
    public ResponseEntity<List<Course>> getAll(){

        return ResponseEntity
                .ok(courseService.getAllCourses());
    }

    // PathVariable

    @GetMapping("/{courseCode}")
    public ResponseEntity<Course> getCourse(
            @PathVariable String courseCode){

        return ResponseEntity
                .ok(courseService.getCourse(courseCode));
    }

    // RequestParam

    @GetMapping("/search")
    public ResponseEntity<Course> getByParam(
            @RequestParam String code){

        return ResponseEntity
                .ok(courseService.getCourse(code));
    }

    // Create

    @PostMapping("/create")
    public ResponseEntity<Course> create(

            @RequestBody Course course){

        return ResponseEntity
                .ok(courseService.addCourse(course));
    }

    // Update

    @PutMapping("/{courseCode}")
    public ResponseEntity<Course> update(

            @PathVariable String courseCode,

            @RequestBody Course course){

        return ResponseEntity
                .ok(
                        courseService
                                .updateCourse(
                                        courseCode,
                                        course));
    }

    // Delete

    @DeleteMapping("/{courseCode}")
    public ResponseEntity<String> delete(

            @PathVariable String courseCode){

        return ResponseEntity
                .ok(
                        courseService
                                .deleteCourse(
                                        courseCode));
    }

}