package com.codeclan.example.bookingsystem.repositories.bookingRepository;

import com.codeclan.example.bookingsystem.models.Booking;
import com.codeclan.example.bookingsystem.projections.EmbedCourseAndCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedCourseAndCustomer.class)
public interface BookingRepository extends JpaRepository<Booking, Long> {

    public List<Booking> getAllBookingsByDate(String date);


}
