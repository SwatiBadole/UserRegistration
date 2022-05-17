package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    //UC1
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue(){
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validateFirstName("Swati");
        Assertions.assertTrue(result);
    }
    //UC2
    @Test
    public void givenLastName_whenProper_ShouldReturnTrue(){
        UserRegistration userRegistration=new UserRegistration();
        boolean result =userRegistration.validateLastName("Badole");
        Assertions.assertTrue(result);
   }
   //UC3
   @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
       UserRegistration userRegistration = new UserRegistration();
       boolean result = UserRegistration.validateEmail("swa@ti.com");
       Assertions.assertTrue(result);
   }
    //UC4
   @Test
    public void givenMobileFormat_whenProper_shouldreturnTrue(){
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validateMobileNumber("8605690756");
        Assertions.assertTrue(result);
   }
   //UC5
    @Test
    public void givenPassword_whenProper_shouldreturnTrue(){
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validatePasswordRule1("swatibad");
        Assertions.assertTrue(result);
    }
    //UC6
    @Test
    public void givenPasswordRule02_whenProper_shouldreturnTrue(){
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validatePasswordRule2("Swatibad");
        Assertions.assertTrue(result);
    }
    //UC7
    @Test
    public void givenPasswordRule03_whenProper_shouldreturnTrue(){
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validatePasswordRule3("Swatibad2002");
        Assertions.assertTrue(result);
    }
    //UC8
    @Test
    public void givenPasswordRule04_whenProper_shouldreturnTrue(){
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validatePasswordRule4("Swati@gmail.com");
        Assertions.assertTrue(result);
    }
    //UC9
    @Test
    public void givenemailSamples_WhenProper_ShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.emailSamples("Swatibadole2021998@gmail.com");
        Assertions.assertTrue(result);
    }
}