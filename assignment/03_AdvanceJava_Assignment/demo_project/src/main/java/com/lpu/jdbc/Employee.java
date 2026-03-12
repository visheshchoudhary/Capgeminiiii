package com.lpu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
			
	private static String url = "jdbc:postgresql://localhost:5432/lpu";
	private static String user = "postgres";
	private static String pass = "root";
	private static Connection con;
	
	static
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, user, pass);
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void insertOperation()
	{
		try
		{
//			Statement stm = con.createStatement();
//			stm.execute("insert into employee values(2, 'Ram', 45000.0, 'ram123@gmail.com', 9823899923)");
			
			PreparedStatement ps = con.prepareStatement("insert into employee values(?, ?, ?, ?, ?)");
			ps.setInt(1, 3);
			ps.setString(2, "Shyam");
			ps.setDouble(3, 30000.0);
			ps.setString(4, "shyam123@gmail.com");
			ps.setLong(5, 8999989898L);
			
			ps.execute();
			System.out.println("Insertion Done");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void updateOperation()
	{
		try
		{
			Statement stm = con.createStatement();
			stm.execute("update employee set name = 'Anshul' where id = 1");
			System.out.println("Updation Done");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void deleteOperation()
	{
		try
		{
			Statement stm = con.createStatement();
			stm.execute("delete from employee where id = 1");
			System.out.println("Deletion Done");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void findAllEmployee()
	{
		try
		{
			Statement stm = con.createStatement();
			stm.execute("select * from employee");
			ResultSet res = stm.getResultSet();
			
			while(res.next())
			{
				System.out.print(res.getInt("id") + " ");
				System.out.print(res.getString("name") + " ");
				System.out.print(res.getDouble("sal") + " ");
				System.out.print(res.getString("email") + " ");
				System.out.print(res.getLong("phone") + " ");
				System.out.println();
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void findById()
	{
		try
		{
			Statement stm = con.createStatement();
			stm.execute("select * from employee where id = 1");
			ResultSet res = stm.getResultSet();
			
			while(res.next())
			{
				System.out.print(res.getInt("id") + " ");
				System.out.print(res.getString("name") + " ");
				System.out.print(res.getDouble("sal") + " ");
				System.out.print(res.getString("email") + " ");
				System.out.print(res.getLong("phone") + " ");
				System.out.println();
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
		
	public static void closeConnection()
	{
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
//		insertOperation();
//		updateOperation();
//		deleteOperation();
		
		findAllEmployee();
//		findById();
	}
}
