package org.example.test;

import org.example.test.PasswordGenerator;

public class WrongFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "12";  // 2자
    }

}
