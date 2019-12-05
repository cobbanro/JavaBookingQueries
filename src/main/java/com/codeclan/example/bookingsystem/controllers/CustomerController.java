package com.codeclan.example.bookingsystem.controllers;

import com.codeclan.example.bookingsystem.models.Customer;
import com.codeclan.example.bookingsystem.repositories.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")

public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/courses/{course}")
    public List<Customer> getCustomerByCourse(@PathVariable Long course){
        return customerRepository.findAllCustomerByBookingsCourseId(course);
    }

    @GetMapping(value = "/town/{town}/course/{course}")
    public List<Customer> getCustomerByTownAndCourse(@PathVariable String town, @PathVariable Long course){
        return customerRepository.findAllCustomerByTownIgnoreCaseAndBookingsCourseId(town, course);
    }

    @GetMapping(value = "/age/{age}/town/{town}/course/{course}")
    public List<Customer> getCustomerByAgeAndTownAndCourse(@PathVariable int age, @PathVariable String town, @PathVariable Long course){
        return customerRepository.findAllCustomerByAgeGreaterThanAndTownIgnoreCaseAndBookingsCourseId(age, town, course);
    }

}
