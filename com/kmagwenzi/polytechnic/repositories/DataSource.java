package com.kmagwenzi.polytechnic.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DataSource{

    private static final String URL = "jdbc:mysql://localhost:3306/polytechnic";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "";

    static Connection getConnection() throws SQLException { 
        return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
    }
    



}

