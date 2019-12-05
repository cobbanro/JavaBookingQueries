package com.codeclan.example.bookingsystem.repositories.courseRepository;

import com.codeclan.example.bookingsystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    public List<Course> getAllCoursesByStarRating(int rating);

    public List<Course> getAllCoursesByBookingsCustomerId(Long customerId);

}
