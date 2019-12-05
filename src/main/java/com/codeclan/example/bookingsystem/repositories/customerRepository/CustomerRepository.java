package com.codeclan.example.bookingsystem.repositories.customerRepository;

import com.codeclan.example.bookingsystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


    public List<Customer> findAllCustomerByBookingsCourseId(Long courseId);

}
