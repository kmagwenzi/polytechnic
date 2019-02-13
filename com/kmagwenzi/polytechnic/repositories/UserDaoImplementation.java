package com.kmagwenzi.polytechnic.repositories;

import com.kmagwenzi.polytechnic.models.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImplementation implements UserDao {

    String url = "jdbc:mysql://localhost:3306/polytechnic";
    String userName = "root";
    String password = "root";

    Connection conn = null;
    Statement stmt = null; 
    PreparedStatement p = null;
    ResultSet results = null;

    
    @Override
    public void saveUserDetails(User user) {

    
        try {
            conn = DriverManager.getConnection(url, userName, password);
            p = conn.prepareStatement("INSERT INTO users(name, email, role, password) VALUES (?,?,?,?)");

            p.setString(1, user.getName());
            p.setString(2, Encryptor.encrypt(user.getPassword()));

            
            System.out.println(user.toString());
            
            p.executeUpdate();
            p.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Test Failed");
            e.printStackTrace();
        }
        

    }
}
