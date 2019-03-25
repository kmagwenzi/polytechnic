package com.kmagwenzi.polytechnic.controllers;

import com.kmagwenzi.polytechnic.models.User;

public abstract class Controller{

  User user;
   
  
  public void showMenu(){
    String role = user.getRole();

    System.out.println("______  ////  Menu  \\\\  ______");
    System.out.println("________________________________________________");

    if (role.equalsIgnoreCase("Student")) {
      System.out.println("  - Profile        [1]     - Classes       [2]");  
    }else{
      System.out.println("  - Students       [1]     - Classes       [2]"); 
    }
    
     
    if (role.equalsIgnoreCase("Admin")) {
      System.out.println(" - Modules        [2]     - Users         [3]");   
      System.out.println("  - Logout         [0] ");

    }else{
      System.out.println("- Modules        [2]     - Logout         [0] ");
    }


    System.out.println("________________________________________________");
    System.out.println("______________________________________________________");

  }

  public abstract void executeSelection(User user);




}