package com.kmagwenzi.polytechnic.models;

public class User{



  String role;
  String name;
  String email;
  Gender gender;

  public User() {
    super();
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Gender getGender() {
    return this.gender;
  }

  public void setGender(Gender gender) {
     this.gender = gender;
  }


  @Override
  public String toString(){

    return "\nUser{"

      + "Name: " + this.getName()
      + "Gender: " + this.getGender()
      + "Email: " + this.getEmail()
      + "Role: " + this.getRole()

    + "}";


  }
  
}