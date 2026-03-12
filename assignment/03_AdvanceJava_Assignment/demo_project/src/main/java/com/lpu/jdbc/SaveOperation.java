package com.lpu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveOperation {

	public static void main(String[] args) {
		
		String url = "jdbc:postgresql://localhost:5432/lpu";
		String user = "postgres";
		String pass = "root";
		
		try 
		{
			// 1st step load driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is Loaded");
			
			// 2nd create connection
			Connection con = DriverManager.getConnection(url, user, pass);
			
			// 3rd create statement
			Statement stm = con.createStatement();
			
			// 4th execute query
//			stm.execute("insert into student values(6, 'John', 9882499889, 85.5)");
			stm.execute("select * from student");
			ResultSet res = stm.getResultSet();
			
			while(res.next()) 
			{
				System.out.print(res.getInt("id") + " ");
				System.out.print(res.getString("name") + " ");
				System.out.print(res.getLong("phone") + " ");
				System.out.print(res.getDouble("marks") + " ");
				System.out.println();
			}
			
			// 5th close connection
			con.close();
			
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
