package com.kmagwenzi.polytechnic.controllers;

import com.kmagwenzi.polytechnic.models.User;

public class StudentController extends Controller{

  public StudentController(User user) {

	}

  @Override
<<<<<<< Updated upstream
  public void executeSelection(User user) {
=======
  public void executeSelection() {

    StudentController.showStudentMenu();
    StudentController.selection = StudentController.getSelection();

    LoopSelection: while (true) {
<<<<<<< HEAD

      switch (StudentController.selection) {
        case 1:
          // View Marks
          profileService.viewMarks();
          break LoopSelection;

        case 2:
          // View Stats & Performance
          profileService.viewStats();

          break;

        case 0:
          // Exit
          break LoopSelection;

      }

    }
=======
    
      switch (StudentController.selection) {
        case 1: 
            // View Marks
            profileService.viewMarks();
        break LoopSelection;

        case 2:
            // View Stats & Performance
            
            profileService.viewStats();

        break;

        case 0:
            // Exit
        break LoopSelection;

     }
>>>>>>> 5211840e8b4c8ea406f5aef85446e23119586dc9
>>>>>>> Stashed changes

  }

<<<<<<< Updated upstream
=======
<<<<<<< HEAD
=======
  



>>>>>>> 5211840e8b4c8ea406f5aef85446e23119586dc9
  private static int getSelection(){
    System.out.println();
    System.out.print("selection: ");
    return scan.nextInt();
  }
<<<<<<< HEAD
  
  private static void showStudentMenu() {
    System.out.println("-- User Profile --");                                  
    System.out.println("------------------------------------------------------------------");
    System.out.println();
    System.out.println("  -> View Marks                 [1]   -> Modules           [2]");
    System.out.println("  -> View Stats & Performance   [3]   -> Menu              [0]");
  }

  

  



  
=======
>>>>>>> 5211840e8b4c8ea406f5aef85446e23119586dc9
>>>>>>> Stashed changes

  
}