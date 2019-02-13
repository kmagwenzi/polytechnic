package com.kmagwenzi.polytechnic;

import com.kmagwenzi.polytechnic.models.User;
import com.kmagwenzi.polytechnic.services.UserService;
import com.kmagwenzi.polytechnic.services.UserServiceImplementation;

import java.util.Scanner;

public class PolytechnicConsole{

    private static Scanner scan = new Scanner(System.in);
    private static int selection;
    private static UserService userService = new UserServiceImplementation();


    public static void main(String[] args){

        Title: while (true) {
            PolytechnicConsole.showTitle();
            PolytechnicConsole.selection = PolytechnicConsole.getSelection();

            switch (PolytechnicConsole.selection) {
                case 1: 
                    // Log In
                break Title;

                case 2:
                    // Sign Up
                    User user = new User();
                    userService.captureUserDetails(user);
                break;

                case 0:
                    // Exit
                break Title;
            }


        }

        Application: while(true){
            break Application;
        }

        System.out.println("\n------------------------------------------------------------------");
        System.out.println("\nGoodbye ...");
    }

    private static void showTitle() {
        
            

        System.out.println("\n");
        System.out.println("                     .---|__|           .-.     |~~~|");
        System.out.println("                  .--|===|--|_          |_|     |~~~|--.");
        System.out.println("                  |  |===|  |'\\     .---!~|  .--|   |--|");
        System.out.println("                  |%%|   |  |.'\\    |===| |--|%%|   |  |");
        System.out.println("                  |%%|   |  |\\.'\\   |   | |__|  |   |  |");
        System.out.println("                  |  |   |  | \\  \\  |===| |==|  |   |  |");
        System.out.println("                  |  |   |__|  \\.'\\ |   |_|__|  |~~~|__|");
        System.out.println("                  |  |===|--|   \\.'\\|===|~|--|%%|~~~|--|");
        System.out.println("                  ^--^---'--^    `-'`---^-^--^--^---'--'");
        System.out.println("______________________________________________________________");					
        System.out.println("    ____       _       _            _           _ ");     
        System.out.println("    |  _ \\ ___ | |_   _| |_ ___  ___| |__  _ __ (_) ___  (R)");
        System.out.println("    | |_) / _ \\| | | | | __/ _ \\/ __| '_ \\| '_ \\| |/ __|");
        System.out.println("    |  __/ (_) | | |_| | ||  __/ (__| | | | | | | | (__ ");
        System.out.println("    |_|   \\___/|_|\\__, |\\__\\___|\\___|_| |_|_| |_|_|\\___|");
        System.out.println("                  |___/");                                                                     
        System.out.println("______________________________________________________________");            	   
        System.out.println();
        System.out.println("   Login        	   	[1]   	  Sign Up               [2]");
        System.out.println("   Exit             	[0]");
       

	}
    
    private static int getSelection(){
        System.out.println();
        System.out.print("selection: ");
        return scan.nextInt();
    }


}
 