package com.umg.apirest.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.umg.apirest.model.Student;
import com.umg.apirest.repository.StudentRepository;

@Service
public class StudentService {
	StudentRepository studentRepository;
	 
	public ResponseEntity<List<Student>> getAllStudents()
	{
		return new ResponseEntity<>(studentRepository.findAll(), HttpStatus.OK);
	}
	
}
