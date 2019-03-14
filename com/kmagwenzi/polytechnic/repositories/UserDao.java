package com.kmagwenzi.polytechnic.repositories;

import com.kmagwenzi.polytechnic.models.User;

public interface UserDao{
   
   public void saveUserDetails(User user);
   public User checkLogin(String email, String password);
  
}
