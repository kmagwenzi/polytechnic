package com.kmagwenzi.polytechnic.repositories;

import com.kmagwenzi.polytechnic.models.User;
import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

            ps.executeUpdate();
            ps.close();

        } catch (SQLException e){
            // TODO Auto-generated catch block
            System.out.println("Test Failed");
            e.printStackTrace();
        }

    }

    @Override
    public User checkLogin(String email, String password) {

        String sql = "SELECT user.email, user.password FROM polytechnic.user WHERE email=?";

        try(
            Connection conn = DataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql); 
        ){
        
            ps.setString(1, email);
            ResultSet result = ps.executeQuery();
            result.first();
            String userPassword = result.getString("password");

            if(password.equals(Encryptor.encrypt(userPassword))){
                System.out.println("Login Successful");
             
                User user = new User();
                
                user.setName(result.getString("name"));
                user.setEmail(result.getString("email"));
                user.setRole(result.getString("role"));
                user.setGender(result.getString("gender"));

                return user;
            }else{
                System.out.println("Login Failed");
                
                return null;
            }
            
        } catch (SQLException e){
            // TODO Auto-generated catch block
            System.out.println("Query Failed: SQLException - " + e);
            e.printStackTrace();
        }

        return null;
    }

    



}
