package com.bridgelabz;

import java.util.Scanner;

public class userRegistrationMain {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        Scanner input = new Scanner(System.in);
        int choice;
        do{

            System.out.println("Enter your choice: ");
            System.out.println("1: Validate Frist name.");
            System.out.println("2: Validate last name");
            System.out.println("3: Validate E-Mail.");
            System.out.println("4: Validate Mobile Number.");
            System.out.println("5: Validate Password FristRule");
            System.out.println("6: validate password secondRule");
            System.out.println("7: validate password thirdRule");
            System.out.println("8: validate password fourthRule");
            System.out.println("0: Exit.");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    UserRegistration.validateFirstName();
                    break;
                case 2:
                    UserRegistration.validateLastName();
                    break;
                case 3:
                    UserRegistration.validateEmail();
                    break;

                case 4:
                    UserRegistration.validateMobileNumber();
                    break;
                case 5:
                    UserRegistration.validatePasswordRule1();
                    break;
                case 6:
                    UserRegistration.validatePasswordRule2();
                    break;
                case 7:
                    UserRegistration.validatePasswordRule3();
                    break;
                case 8:
                    UserRegistration.validatePasswordRule4();
                    break;
                    default:
                    System.out.println("Enter valid input.");
            }
        }while (choice != 0);
    }
}
