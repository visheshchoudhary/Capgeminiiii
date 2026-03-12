package com.practice.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.practice.dao.StudentDao;
import com.practice.model.Student;

public class DBConnection 
{
	public static Connection getConnection() throws SQLException
	{
		MysqlDataSource ds = new MysqlDataSource();
		ds.setUser("anshul94122");
		ds.setPassword("QW1@er2#");
		ds.setUrl("jdbc:mysql://localhost:3306/lpu25");
		
		Connection connection = ds.getConnection();
		return connection;
	}
	
	public static void main(String args[]) throws SQLException
	{
		Connection connection = null;
		try 
		{
			StudentDao sdao = new StudentDao();
			List<Student> students = sdao.findAll();
			students.forEach(System.out::println);
			
			Student newStudent = new Student(102, "Raj", "IT", "8433124002");
			sdao.add(newStudent);
			
			Student s101 = sdao.findById(101);
			System.out.println("s101 = " + s101);
			
			s101.setName("Mohit");
			sdao.update(s101);
			
			sdao.removeById(102);
			
			System.out.println();
			students = sdao.findAll();
			students.forEach(System.out::println);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
