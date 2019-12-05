package com.codeclan.example.bookingsystem.controllers;


import com.codeclan.example.bookingsystem.models.Course;
import com.codeclan.example.bookingsystem.repositories.courseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/courses")

public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/ratings/{rating}")
    public List<Course> getCourseByRating(@PathVariable int rating){
        return courseRepository.getAllCoursesByStarRating(rating);
    }

    @GetMapping(value = "/customers/{customer}")
    public List<Course> getCourseByCustomer(@PathVariable Long customer){
        return courseRepository.getAllCoursesByBookingsCustomerId(customer);
    }

}
