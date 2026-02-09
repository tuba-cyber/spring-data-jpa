package com.tuba.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuba.controller.IStudentControler;
import com.tuba.entities.Student;
import com.tuba.services.IStudentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/rest/api/student")
@Slf4j
public class StudentControllerImpl implements IStudentControler {
	@Autowired
	private IStudentService studentService;

	@PostMapping(path = "/save")
	@Override
	public Student saveStudent(@RequestBody Student student) {
		// Gelen JSON payload'ı doğrulamak için logla
		log.info("Incoming student payload: {}", student);
		return studentService.saveStudent(student);
	}

	@GetMapping(path = "/list")
	@Override
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping(path = "/list/{id}")
	@Override
	public Student getStudentById(@PathVariable(name = "id") Integer id) {
		return studentService.getStudentById(id);
	}

	@DeleteMapping(path = "/delete/{id}")
	@Override
	public void deleteStudent(@PathVariable(name = "id") Integer id) {
		studentService.deleteStudent(id);

	}

}
