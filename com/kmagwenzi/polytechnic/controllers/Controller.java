package com.kmagwenzi.polytechnic.controllers;

import com.kmagwenzi.polytechnic.models.User;

public abstract class Controller{
  
  public void showMenu(){
    System.out.println("-> Students       [1]");
    System.out.println("-> Classes        [2]");
    System.out.println("-> Modules        [3]");
    
  }

  public void executeSelection(User user) {

  }




}