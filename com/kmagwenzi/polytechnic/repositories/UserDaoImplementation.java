package com.kmagwenzi.polytechnic.repositories;

import com.kmagwenzi.polytechnic.models.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImplementation implements UserDao {


    @Override
    public void saveUserDetails(User user) {

        String sql = "INSERT INTO users(name, email, role, password) VALUES (?,?,?,?)";

        try (
            Connection conn = DataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
            
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getRole());
            ps.setString(4, Encryptor.encrypt(user.getPassword()));

            System.out.println(user.toString());

            p.executeUpdate();
            p.close();

        } catch (SQLException e){
            // TODO Auto-generated catch block
            System.out.println("Test Failed");
            e.printStackTrace();
        }

      
        

    }
}
