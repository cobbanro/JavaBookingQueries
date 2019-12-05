package com.codeclan.example.bookingsystem.projections;

import com.codeclan.example.bookingsystem.models.Booking;
import com.codeclan.example.bookingsystem.models.Course;
import com.codeclan.example.bookingsystem.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedCourseAndCustomer", types = Booking.class)

public interface EmbedCourseAndCustomer {

    String getDate();
    Course getCourse();
    Customer getCustomer();

}
