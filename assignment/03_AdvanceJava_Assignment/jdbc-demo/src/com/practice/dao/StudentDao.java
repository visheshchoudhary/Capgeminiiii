package com.practice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.practice.db.DBConnection;
import com.practice.model.Student;

public class StudentDao 
{
	public List<Student> findAll()
	{
		List<Student> list = new ArrayList<>();
		try
		{
			Connection connection = DBConnection.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from student");
			while(resultSet.next())
			{
				int roll1 = resultSet.getInt("roll");
				String name = resultSet.getString("name");
				String branch = resultSet.getString("branch");
				String phone = resultSet.getString("phone");
				Student s = new Student(roll1, name, branch, phone);
				list.add(s);
			}
			
			resultSet.close();
			statement.close();
			connection.close();
			
			return list;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public Student findById(int roll)
	{
		// PreparedStatement select * from student where roll = ?
		try(Connection connection = DBConnection.getConnection())
		{
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from student where roll = " + roll);
			if(resultSet.next())
			{
				int roll1 = resultSet.getInt("roll");
				String name = resultSet.getString("name");
				String branch = resultSet.getString("branch");
				String phone = resultSet.getString("phone");
				
				Student s = new Student(roll, name, branch, phone);
				return s;
			}
			
			statement.close();
			resultSet.close();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public boolean removeById(int roll)
	{
		// delete from student where roll = ?
		try(Connection connection = DBConnection.getConnection())
		{
			Statement statement = connection.createStatement();
			int rowsUpdated = statement.executeUpdate("delete from student where roll = " + roll);
			if(rowsUpdated == 1)
				return true;
			statement.close();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	public Student update(Student student)
	{
		
		try(Connection connection = DBConnection.getConnection())
		{
			PreparedStatement pst = connection.prepareStatement("update student set name = ?, branch = ?, phone = ? where roll = ?");
			pst.setString(1, student.getName());
			pst.setString(2, student.getBranch());
			pst.setString(3, student.getPhone());
			pst.setInt(4, student.getRoll());
			
			int affected = pst.executeUpdate();
			if(affected == 1)
				return student;
			pst.close();
		}
		catch (SQLException e)	
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	public Student add(Student student)
	{
		try (Connection connection = DBConnection.getConnection()) {
			PreparedStatement pst = connection.prepareStatement("insert into student values (?, ?, ?, ?)");
			pst.setInt(1, student.getRoll());
			pst.setString(2, student.getName());
			pst.setString(3, student.getBranch());
			pst.setString(4, student.getPhone());
			
			int rowsUpdated = pst.executeUpdate();
			if(rowsUpdated == 1)
				return student;
			else
				return null;
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
