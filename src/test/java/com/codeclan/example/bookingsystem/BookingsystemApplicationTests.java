package com.codeclan.example.bookingsystem;

import com.codeclan.example.bookingsystem.models.Booking;
import com.codeclan.example.bookingsystem.models.Course;
import com.codeclan.example.bookingsystem.models.Customer;
import com.codeclan.example.bookingsystem.repositories.bookingRepository.BookingRepository;
import com.codeclan.example.bookingsystem.repositories.courseRepository.CourseRepository;
import com.codeclan.example.bookingsystem.repositories.customerRepository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BookingsystemApplicationTests {

	@Autowired
	BookingRepository bookingRepository;
	@Autowired
	CourseRepository courseRepository;
	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

//	Get all courses with a given rating
//	Get all customers for a given course
//	Get all courses for a given customer
//	Get all bookings for a given date

	@Test
	public void canGetAllCoursesByStarRating(){
		List<Course> foundCourse = courseRepository.getAllCoursesByStarRating(5);
		assertEquals(1, foundCourse.size());
		assertEquals("Software Development", foundCourse.get(0).getName());
	}

	@Test
	public void canGetAllCustomersForAGivenCourse(){
		List<Customer> foundCustomer = customerRepository.findAllCustomerByBookingsCourseId(1L);
		assertEquals(1, foundCustomer.size());
		assertEquals("Mark", foundCustomer.get(0).getName());
	}

	@Test
	public void canGetAllCoursesForAGivenCustomer(){
		List<Course> foundCourse = courseRepository.getAllCoursesByBookingsCustomerId(1L);
		assertEquals(1, foundCourse.size());
		assertEquals("Software Development", foundCourse.get(0).getName());
	}

	@Test
	public void canGetAllBookingsForAGivenDate(){
		List<Booking> foundBooking = bookingRepository.getAllBookingsByDate("2019-09-14");
		assertEquals(1, foundBooking.size());
		assertEquals("Software Development", foundBooking.get(0).getCourse().getName());
	}

}
