package com.alma.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alma.entity.Course;
import com.alma.repository.CourseRepository;

@Configuration
public class CouserDB {
	@Bean
	CommandLineRunner loadCourse(CourseRepository courseRepository) {
		return args->{
			System.out.println("Loading Course->"+courseRepository.save(
					new Course("Software Engineering","Software Engineering")));
		};
	}
}
