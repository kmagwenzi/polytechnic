package com.kmagwenzi.polytechnic.services;

import com.kmagwenzi.polytechnic.models.Gender;
import com.kmagwenzi.polytechnic.models.User;
import com.kmagwenzi.polytechnic.repositories.UserDao;
import com.kmagwenzi.polytechnic.repositories.UserDaoImplementation;

import java.util.Scanner;

public class UserServiceImplementation implements UserService {
   

    private static int selection;
    private static Scanner scan = new Scanner(System.in);

    private UserDao userDao = new UserDaoImplementation();

    @Override
    public void userLogin() {
        
        User user =  new User();
        
        DataCapture: while (true) {

            UserServiceImplementation.getUserEmail(user);
            userDao.getUser()

            UserServiceImplementation.getSelection();

            switch (selection) {

                case 1:
                    // Save

                case 2:
                    // Re-Enter All


                case 3:
                    // Edit Name
                    
                case 4:
                    // Edit Gender
                    
                case 0:

                    break DataCapture;

                default:

                    System.out.println("\nInvalid selection, Please enter values 0-6");

            }


        }
    }

    @Override
    public void captureUserDetails(User user) {

        String flag = "capture";

        DataCapture: while (true) {

            if (flag.equals("capture")) {
                System.out.print("\nPlease Enter User Details");
                UserServiceImplementation.getUserName(user);
                UserServiceImplementation.getUserGender(user);
                UserServiceImplementation.getUserEmail(user);
                UserServiceImplementation.getUserRole(user);
            }

            System.out.println(user);

            System.out.println("\nSub Menu");
            System.out.println("--------------------------");
            System.out.println("\tSave             [1]");
            System.out.println("\tRe-Enter Details [2]");
            System.out.println("\tEdit             [3-6] | Name[3] Gender[4] Email[5] Role[6]");
            System.out.println("\tCancel           [0]");
            System.out.println("--------------------------");

            UserServiceImplementation.getSelection();

            switch (selection) {

                case 1:
                    // Save
                    userDao.saveUserDetails(user);
                    break DataCapture;

                case 2:
                    // Re-Enter All
                    flag = "capture";
                    break;

                case 3:
                    // Edit Name
                    flag = "edit";
                    UserServiceImplementation.getUserName(user);
                    break;

                case 4:
                    // Edit Gender
                    flag = "edit";
                    UserServiceImplementation.getUserGender(user);
                    break;

                case 5:
                    // Edit Email
                    flag = "edit";
                    UserServiceImplementation.getUserEmail(user);
                    break;

                case 6:
                    // Edit Role
                    flag = "edit";
                    UserServiceImplementation.getUserRole(user);
                    break;

                case 0:

                    break DataCapture;

                default:

                    System.out.println("\nInvalid selection, Please enter values 0-6");

            }


        }

    }


    private static void getUserName(User user){
        System.out.println();
        System.out.print("Name: ");
        user.setName(scan.next());
    }

    private static void getUserGender(User user){
        System.out.println();
            System.out.println("Please enter M or F | M = Male, F = Female. ");
            System.out.println("Gender: ");

            Validate:
            while (true) {
                switch ((UserServiceImplementation.scan.next()).toUpperCase()) {

                    case "M":
                        user.setGender(Gender.MALE);
                        break Validate;

                    case "F":
                        user.setGender(Gender.FEMALE);
                        break Validate;

                    default:
                        System.out.print("Invalid input please enter \'M\' or \'F\'. ");
                }
            }

    }

    private static void getUserEmail(User user){
        System.out.println();
        System.out.print("Email: ");
        user.setEmail(scan.next());
    }


    private static void getUserRole(User user){
        System.out.println();
        System.out.print("Role: ");
        user.setEmail(scan.next());

    }

    private static int getSelection(){
        System.out.println();
        System.out.print("selection: ");
        return scan.nextInt();
    }


   

}

