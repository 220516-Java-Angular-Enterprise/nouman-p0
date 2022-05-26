package com.revature.shopping.ui;

import com.revature.shopping.services.UserService;
import com.revature.shopping.ui.IMenu;

import java.util.Scanner;

public class StartMenu implements IMenu {

    private final UserService userService;

    public StartMenu(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void start() {
        Scanner scan = new Scanner(System.in);

        exit:
        {
            while (true) {

                display();
                System.out.println("\n Enter: ");
                String input = scan.nextLine();
                switch (input) {
                    case "1":
                        login();
                        break;
                    case "2":
                        signup();
                        break;
                    case "x":
                        System.out.println("GoodBye!!!!");
                        break exit;
                    default:
                        System.out.println("\n Invalid Input");
                        break;
                }
            }
        }
    }

    private void display() {
        System.out.println("\nWelcome to Shopping Application");
        System.out.println("[1] Login");
        System.out.println("[2] Signup");
        System.out.println("[X] Exit");
    }

    private void login() {
        System.out.println("Needs Implementation");
    }

    private void signup() {
        Scanner scan = new Scanner(System.in);


        System.out.println("Creating an account....");

        while (true) {
            System.out.print("\nUsername: ");
            String userName = scan.nextLine();

            if (userService.isValidUsername(userName)) {
                System.out.println("Good Username !!!");
                break;
            } else System.out.println("Invalid Username. Username should be between 8-20 characters long.");

                while(true){
                    System.out.println("\nPassword: ");
                    String password = scan.nextLine();


                    if (userService.isValidPassword(password)) {
                        System.out.println("Good Password !!!");
                        System.out.println("\nRe-enter in password again");
                        String confirmPassword = scan.nextLine();


                        if (password.equals(confirmPassword)) {
                            System.out.println("Password Confirmed!!!");
                            break;
                        } else System.out.println("Password does not match");
                    } else System.out.println("Invalid Password");

                }

            }

        }

    }


