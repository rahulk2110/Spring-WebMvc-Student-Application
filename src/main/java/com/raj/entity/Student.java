package com.raj.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
public class Student {

	@Id
	@GeneratedValue
	private Integer ID;
	private String Name;
	private String Email;
	private String Gender;
	private String Course;
	private String[] timings;
	
}
