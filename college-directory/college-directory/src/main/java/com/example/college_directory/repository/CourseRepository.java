package com.example.college_directory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.college_directory.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
