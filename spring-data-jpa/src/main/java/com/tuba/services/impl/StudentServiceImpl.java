package com.tuba.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuba.entities.Student;
import com.tuba.repository.StudentRepository;
import com.tuba.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> studentList = studentRepository.findAll();
		return studentList;
		// return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Integer id) {

		Optional<Student> optional = studentRepository.findById(id);
		if (optional.isPresent()) {// = if(!optional.isEmpty()) //id boş değilse
			return optional.get();
		}
		return null; // veriyi bulamazsa null dönecek sonra exception yazılacak

	}

	@Override
	public void deleteStudent(Integer id) {
		Student dbStudent = getStudentById(id);
		if(dbStudent!=null) {
		studentRepository.delete(dbStudent);
		}
		
	}

}
