package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
@FunctionalInterface
interface UserDetailsValidationFI {
    boolean validate(String x) throws UserRegistrationException;
}

public class UserRegistrationFunctional {
    UserDetailsValidationFI validFirstName = firstNmae -> {
        if (firstNmae == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (firstNmae.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        {
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(firstNmae);
            return matcher.matches();
        }
    };
}
