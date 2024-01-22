package com.girmiti.annonymous;

import java.util.function.Predicate;

public class PalindromeChecker {

    public static void main(String[] args) {
        // Test the palindrome check with different strings
        String str1 = "level";
        String str2 = "hello";

        // Lambda expression to check if a string is a palindrome
        Predicate<String> palindromeCheck = s -> {  //Method signature is applied
            String reversed = new StringBuilder(s).reverse().toString();
            return s.equals(reversed);
        };

        // Test the first string
        if (palindromeCheck.test(str1)) {
            System.out.println(str1 + " is a palindrome.");
        } else {
            System.out.println(str1 + " is not a palindrome.");
        }

        // Test the second string
        if (palindromeCheck.test(str2)) {
            System.out.println(str2 + " is a palindrome.");
        } else {
            System.out.println(str2 + " is not a palindrome.");
        }
    }


	}


