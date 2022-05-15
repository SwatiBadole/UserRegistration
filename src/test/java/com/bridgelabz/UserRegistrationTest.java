package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue(){
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.validateFirstName("Swati");
        Assertions.assertTrue(result);
    }git
}
