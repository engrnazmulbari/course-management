package com.alma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alma.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{

}
