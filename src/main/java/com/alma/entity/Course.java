package com.alma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Course {
	@Id
	@GeneratedValue
	private Integer id;
	private String courseName;
	private String description;
	
	public Course(String courseName, String description) {
		super();
		this.courseName = courseName;
		this.description = description;
	}
	
	
}
