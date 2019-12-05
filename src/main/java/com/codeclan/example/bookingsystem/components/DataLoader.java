package com.codeclan.example.bookingsystem.components;

import com.codeclan.example.bookingsystem.repositories.bookingRepository.BookingRepository;
import com.codeclan.example.bookingsystem.repositories.courseRepository.CourseRepository;
import com.codeclan.example.bookingsystem.repositories.customerRepository.CustomerRepository;
import com.codeclan.example.bookingsystem.models.Booking;
import com.codeclan.example.bookingsystem.models.Course;
import com.codeclan.example.bookingsystem.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Customer customer1 = new Customer("Mark", "Watford", 32);
        customerRepository.save(customer1);
        Course course = new Course("Software Development", "Edinburgh", 5);
        courseRepository.save(course);
        Booking booking1 = new Booking("2019-09-14", course, customer1);
        bookingRepository.save(booking1);

    }
}
