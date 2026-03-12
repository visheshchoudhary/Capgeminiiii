package com.lpu.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lpu.Entity.Student1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

@Component
public class Student1DAO {
	
	@Autowired
	private EntityManagerFactory emf;
	
	public Student1 saveStudent(Student1 student)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(student);
		et.commit();
		em.close();
		
		return student;
	}
	
	public Student1 findById(int id)
	{
		EntityManager em = emf.createEntityManager();
		Student1 student = em.find(Student1.class, id);
		
		em.close();
		
		return student;
	}
}
