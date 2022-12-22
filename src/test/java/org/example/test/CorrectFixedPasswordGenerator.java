package org.example.test;

import org.example.test.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "12345678";  // 8자
    }

}
