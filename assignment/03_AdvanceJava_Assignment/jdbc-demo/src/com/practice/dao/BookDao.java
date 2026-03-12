package com.practice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.practice.db.BookConnection;
import com.practice.model.Book;

public class BookDao {

    public List<Book> findAll() 
    {
        List<Book> list = new ArrayList<>();
        
        try (Connection connection = BookConnection.getConnection()) 
        {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM book");
            
            while (resultSet.next()) 
            {
                int bid = resultSet.getInt("bid");
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                double price = resultSet.getDouble("price");

                Book book = new Book(bid, title, author, price);
                list.add(book);
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return list;
    }

    public Book findById(int bid) 
    {
        try (Connection connection = BookConnection.getConnection()) 
        {
        	PreparedStatement pst = connection.prepareStatement("SELECT * FROM book WHERE bid = ?");
            pst.setInt(1, bid);
            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) 
            {
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                double price = resultSet.getDouble("price");

                return new Book(bid, title, author, price);
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return null;
    }

    public boolean removeById(int bid) 
    {
        try (Connection connection = BookConnection.getConnection()) 
        {
        	PreparedStatement pst = connection.prepareStatement("DELETE FROM book WHERE bid = ?");
            pst.setInt(1, bid);

        	int rowsDeleted = pst.executeUpdate();
            return rowsDeleted == 1;

        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return false;
    }

    public Book update(Book book) 
    {
        try (Connection connection = BookConnection.getConnection())
        {
            PreparedStatement pst = connection.prepareStatement("UPDATE book SET title = ?, author = ?, price = ? WHERE bid = ?");
            pst.setString(1, book.getTitle());
            pst.setString(2, book.getAuthor());
            pst.setDouble(3, book.getPrice());
            pst.setInt(4, book.getBid());

            int affected = pst.executeUpdate();
            return affected == 1 ? book : null;

        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return null;
    }

    public Book add(Book book) {

        try (Connection connection = BookConnection.getConnection()) 
        {
        	PreparedStatement pst = connection.prepareStatement("INSERT INTO book VALUES (?, ?, ?, ?)");
            pst.setInt(1, book.getBid());
            pst.setString(2, book.getTitle());
            pst.setString(3, book.getAuthor());
            pst.setDouble(4, book.getPrice());

            int rowsInserted = pst.executeUpdate();
            return rowsInserted == 1 ? book : null;

        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return null;
    }
}
