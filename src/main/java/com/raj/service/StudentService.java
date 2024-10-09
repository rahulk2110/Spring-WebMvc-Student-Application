package com.raj.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	public List<String>getCourse(){
		return Arrays.asList("Java" , "Python",".net","SQL","MERN","react","Spring");
	}
	
	public List<String>getTiming(){
		return Arrays.asList("Morning" , "Afternoon","Evening");
	}

}
