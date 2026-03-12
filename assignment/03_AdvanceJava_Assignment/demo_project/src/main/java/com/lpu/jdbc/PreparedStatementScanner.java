package com.lpu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementScanner {
		
	
	private static String url = "jdbc:postgresql://localhost:5432/lpu";
	private static String user = "postgres";
	private static String pass = "root";
	private static Connection con;
	static Scanner sc = new Scanner(System.in);
	
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
			PreparedStatement ps = con.prepareStatement("insert into employee values(?, ?, ?, ?, ?)");
			ps.setInt(1, sc.nextInt());
			sc.nextLine();
			ps.setString(2, sc.nextLine());
			ps.setDouble(3, sc.nextDouble());
			sc.nextLine();
			ps.setString(4, sc.nextLine());
			ps.setLong(5, sc.nextLong());
			
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
			PreparedStatement ps = con.prepareStatement("update employee set name = ? where id = ?");
			ps.setString(1, sc.nextLine());
			sc.nextLine();
			ps.setInt(2, 1);
			
			ps.execute();
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
			PreparedStatement ps = con.prepareStatement("delete from employee where id = ?");
			ps.setInt(1, sc.nextInt());
			ps.execute();
			
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
			PreparedStatement ps = con.prepareStatement("select * from employee");
			ps.execute();
			
			ResultSet res = ps.getResultSet();

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
			PreparedStatement ps = con.prepareStatement("select * from employee where id = ?");
			ps.setInt(1, sc.nextInt());
			ps.execute();
			
			ResultSet res = ps.getResultSet();
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
	
	public static void main(String args[])
	{
//		insertOperation();
//		deleteOperation();
//		updateOperation();
//		findAllEmployee();
//		findById();
	}
}
