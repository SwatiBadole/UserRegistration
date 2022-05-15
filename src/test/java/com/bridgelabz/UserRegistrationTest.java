package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue(){
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validateFirstName("Swati");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenLastName_whenProper_ShouldReturnTrue(){
        UserRegistration userRegistration=new UserRegistration();
        boolean result =userRegistration.validateLastName("Badole");
        Assertions.assertTrue(result);
   }
   @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
       UserRegistration userRegistration = new UserRegistration();
       boolean result = UserRegistration.validateEmail("swa@ti.com");
       Assertions.assertTrue(result);
   }

   @Test
    public void givenMobileFormat_whenProper_shouldreturnTrue(){
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validateMobileNumber("8605690756");
        Assertions.assertTrue(result);
   }
}