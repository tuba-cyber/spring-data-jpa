package com.tuba.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuba.entities.Student;
import com.tuba.repository.StudentRepository;
import com.tuba.services.IStudentService;


@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
	@Override
	public List<Student> getAllStudents() {
		List<Student> studentList=studentRepository.findAll();
		return studentList;
		//return studentRepository.findAll();
	}

}
