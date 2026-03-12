package com.practice.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.practice.dao.BookDao;
import com.practice.model.Book;

public class BookConnection {
	public static Connection getConnection() throws SQLException {
		MysqlDataSource ds = new MysqlDataSource();
		ds.setUser("anshul94122");
		ds.setPassword("QW1@er2#");
		ds.setUrl("jdbc:mysql://localhost:3306/lpu25");

		return ds.getConnection();
	}

	public static void main(String args[]) throws SQLException 
	{
		Connection connection = null;
		try
		{
			BookDao dao = new BookDao();
			List<Book> books = dao.findAll();
			books.forEach(System.out::println);

			Book newBook = new Book(102, "The Alchemist", "Paulo Coelho", 349.99);
			dao.add(newBook);

			Book b101 = dao.findById(101);
			System.out.println("b101 = " + b101);

			if (b101 != null) {
				b101.setTitle("Rich Dad Poor Dad");
				dao.update(b101);
			}

			dao.removeById(102);

			System.out.println("\nUpdated book list:");
			books = dao.findAll();
			books.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
