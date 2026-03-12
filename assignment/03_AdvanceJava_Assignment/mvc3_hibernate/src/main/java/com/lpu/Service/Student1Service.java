package com.lpu.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lpu.DAO.Student1DAO;
import com.lpu.Entity.Student1;

@Component
public class Student1Service {
	
	@Autowired
	private Student1DAO dao;
	
	public Student1 saveStudent(Student1 student)
	{
		dao.saveStudent(student);
		return student;
	}
	
	public Student1 findById(int id)
	{
		return dao.findById(id);
	}
}
