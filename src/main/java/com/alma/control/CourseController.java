package com.alma.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alma.control.service.CourseService;
import com.alma.entity.Course;

@RestController
@RequestMapping
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/course")
	public List<Course> getCourses(){
		return courseService.getCourses();
	}
}
