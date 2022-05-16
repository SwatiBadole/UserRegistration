package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);

    public static void validateFirstName() {

        System.out.println("Enter first name: ");
        String fName = sc.next();
        String regex = "^[A-Z]{1}[a-z]*";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fName);
        boolean r = matcher.matches();

        if (r)
            System.out.println("It is a valid first name.");
        else
            System.out.println("It is invalid first name.");
    }

    public static boolean validateLastName() {

        System.out.println("Enter last name: ");
        String lName = sc.next();
        String regex1 = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(lName);
        boolean r = matcher1.matches();

        if (r)
            System.out.println("It is a valid last name.");
        else
            System.out.println("It is invalid last name.");
        return r;
    }

    public static void validateEmail() {
        System.out.println("Enter your E-mail: ");
        String email = sc.next();
        String regex2 = "^[a-zA-Z0-9]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(email);
        boolean r = matcher2.matches();

        if (r)
            System.out.println("It is a valid E-mail.");
        else
            System.out.println("It is invalid E-mail.");

    }

    public static void validateMobileNumber() {
        System.out.println("Enter your mobile number: ");
        String mobileNo = sc.next();
        String regex3 = "(0|91)?[7-9][0-9]{9}";

        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(mobileNo);
        boolean r = matcher3.matches();

        if (r)
            System.out.println("It is a valid Mobile Number.");
        else
            System.out.println("It is invalid Mobile Number.");

    }

    public static void validatePasswordRule1() {
        System.out.println("Enter The Password Atleast Eight Character: ");
        String password = sc.nextLine();
        String regex4 = "^[A-Z a-z 0-9]{8,}$";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(password);
        boolean r = matcher4.matches();

        if (r)
            System.out.println("It is a valid Password.");
        else
            System.out.println("It is invalid Password.");

    }

    public static void validatePasswordRule2() {
        System.out.println("Enter The Password Atleast Eight Character one Upper case: ");
        String password = sc.nextLine();
        String regex5 = "^[A-Z]{1}+[a-z 0-9]{7,}$";
        Pattern pattern5 = Pattern.compile(regex5);
        Matcher matcher5 = pattern5.matcher(password);
        boolean r = matcher5.matches();

        if (r)
            System.out.println("It is a valid Password.");
        else
            System.out.println("It is invalid Password.");
    }

    public static void validatePasswordRule3() {
        System.out.println("Enter The Password At least one Upper case and one numeric");
        String password = sc.nextLine();
        String regex6 = "^[A-Z]{1}+[a-zA-Z]{6}+[0-9]+{1}$";
        Pattern pattern6 = Pattern.compile(regex6);
        Matcher matcher6 = pattern6.matcher(password);
        boolean r = matcher6.matches();

        if (r)
            System.out.println("It is a valid Password.");
        else
            System.out.println("It is invalid Password.");
    }

    public static void validatePasswordRule4() {
        System.out.println("Enter the Password At least One Upper Case & One Numeric & One Special Character:");
        String password = sc.nextLine();
        String regex7 = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$";
        Pattern pattern7 = Pattern.compile(regex7);
        Matcher matcher7 = pattern7.matcher(password);
        boolean r = matcher7.matches();

        if (r)
            System.out.println("It is a valid Password.");
        else
            System.out.println("It is invalid Password.");
    }

    public boolean validateFirstName(String fname) {
        String regex = "^[A-Z]{1}[a-z]*";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(fname);
        boolean r = m.matches();
        return r;
    }

    public boolean validateLastName(String lName) {
        String regex = "^^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(lName);
        boolean r = m.matches();
        return r;
    }
    public static boolean validateEmail(String email) {
        String regex = "^[a-zA-Z0-9]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        boolean r = m.matches();
        return r;
    }
    public  static boolean validateMobileNumber(String mobileNo){
        String regex = "(0|91)?[7-9][0-9]{9}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(mobileNo);
        boolean r = m.matches();
        return r;
    }

    public  static boolean validatePasswordRule1(String password){
        String regex = "^[A-Z a-z 0-9]{8,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        boolean r = m.matches();
        return r;
    }

    public boolean validatePasswordRule2(String password) {
        String regex = "^[A-Z]{1}+[a-z 0-9]{7,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        boolean r = m.matches();
        return r;
    }

    public boolean validatePasswordRule3(String password) {
        String regex = "\"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$\"";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        boolean r = m.matches();
        return r;
    }
}