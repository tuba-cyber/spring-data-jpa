package com.tuba.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuba.controller.IStudentControler;
import com.tuba.entities.Student;
import com.tuba.services.IStudentService;


@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentControler{
	@Autowired
	private IStudentService studentService;
	
	@PostMapping(path="/save")
	@Override
	public Student saveStudent(@RequestBody Student student) {

		return studentService.saveStudent(student);
	}

}
