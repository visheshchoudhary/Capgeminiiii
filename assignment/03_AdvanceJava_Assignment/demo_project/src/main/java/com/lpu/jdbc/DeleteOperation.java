package com.lpu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteOperation {
	
	public static void main(String args[])
	{
		String url = "jdbc:postgresql://localhost:5432/lpu";
		String user = "postgres";
		String pass = "root";
		
		try
		{
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loaded");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println(con);
			
			Statement stm = con.createStatement();
			
			stm.execute("delete from student where id = 6");
			System.out.println("Executed");
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
}
