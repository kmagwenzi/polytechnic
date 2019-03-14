package com.kmagwenzi.polytechnic.services;

import com.kmagwenzi.polytechnic.controllers.Controller;
import com.kmagwenzi.polytechnic.models.User;

public interface UserService{

  public void captureUserDetails(User user);
  public Controller userLogin();

}