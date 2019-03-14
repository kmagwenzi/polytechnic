package com.kmagwenzi.polytechnic.models;

public class User{

  private String role;
  private String name;
  private String email;
  Gender gender;
  private String password;


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

  public void setGender(String gender) {
    
    if(gender.equalsIgnoreCase("Male")){
       this.gender = this.gender.MALE; 
    }else{
      this.gender = this.gender.FEMALE;
    }
    
 }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
     this.password = password;
  }

  

  @Override
  public String toString(){

    return "\nUser{\n"

      + "\tName: " + this.getName()
      + "\tGender: " + this.getGender()
      + "\tEmail: " + this.getEmail()
      + "\tRole: " + this.getRole()
    
    + "\n}";

  }
  
}