package com.KSRIT.demo.CourseRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KSRIT.demo.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}