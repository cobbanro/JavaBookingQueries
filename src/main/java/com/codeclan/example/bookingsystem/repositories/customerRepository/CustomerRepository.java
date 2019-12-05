package com.codeclan.example.bookingsystem.customerRepository;

import com.codeclan.example.bookingsystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
