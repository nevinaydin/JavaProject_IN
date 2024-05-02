package com.ideen.javaCodingTasks;

public class ValidatePassword {
    /*
    Password Validation Task
    Overview:
    You are tasked with implementing a method for validating passwords based on certain criteria. The method should return true if the password meets all the requirements, and false otherwise.

    Requirements:
    The password validation criteria are as follows:

    The password length must be at least 6 characters.
    The password must not contain any whitespace characters (spaces).
    The password must contain at least one uppercase letter (A-Z).
    The password must contain at least one lowercase letter (a-z).
    The password must contain at least one special character from the following set: !@#$%^&*(),.?":{}|<>.
    The password must contain at least one digit (0-9).
         */
    public static void main(String[] args) {
        System.out.println(validatePassword1("Ab*1Ab"));
        System.out.println(validatePassword1("Ab*1A"));

        System.out.println(validatePassword2("Ab*1Ab"));
        System.out.println(validatePassword2("Ab*1A"));

        System.out.println(validatePassword3("Ab*1Ab"));
        System.out.println(validatePassword3("Ab1Acd"));

        System.out.println(validatePassword4("Ab*1Ab"));
        System.out.println(validatePassword4("Ab1Acd"));

    }

    public static boolean validatePassword1(String password) {

        String lowercase = "(.*[a-z].*)";
        String uppercase = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialchars = "(.*[ -/, :-@].*)";

        boolean HasLower = password.matches(lowercase),
                HasUpper = password.matches(uppercase),
                HasDigits = password.matches(numbers),
                HasSpecial = password.matches(specialchars),
                isValid = false;

        if (password.length() >= 6 && !password.contains(" "))
            if (HasLower && HasUpper && HasDigits && HasSpecial)
                isValid = true;
        return isValid;
    }

    public static boolean validatePassword2(String password) {
        if ((password.length() < 6) || (password.contains(" ")) || (!password.matches(".*[A-Z].*")) || (!password.matches(".*[a-z].*")) || (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) || (!password.matches(".*\\d.*"))) {
            return false;
        }
        return true; // if all requirements are met
    }

    public static boolean validatePassword3(String password) {

        //More readable version of the solution would be like below.
        // Check if password length is at least 6 characters
        if (password.length() < 6) {
            return false;
        }

        // Check if password contains any whitespace characters
        if (password.contains(" ")) {
            return false;
        }

        // Check if password contains at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Check if password contains at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Check if password contains at least one special character
        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            return false;
        }

        // Check if password contains at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // If all requirements are met, return true
        return true;
    }


    public static boolean validatePassword4(String password) {
        // Check if password length is at least 6 characters
        if (password.length() < 6) {
            return false;
        }

        // Check if password contains any whitespace characters
        for (char c : password.toCharArray()) {
            if (Character.isWhitespace(c)) {
                return false;
            }
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;

        // Iterate over each character in the password to check for uppercase, lowercase, and digits
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                // If the character is not a letter or digit, it must be a special character
                // Set a flag indicating that a special character is found
                hasSpecialCharacter = true;
            }
        }

        // Check if all required criteria are met
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialCharacter;
    }


}


