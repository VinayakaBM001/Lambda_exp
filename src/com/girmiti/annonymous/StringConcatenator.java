package com.girmiti.annonymous;

import java.util.function.BiFunction;

public class StringConcatenator {

    public static void main(String[] args) {
        // Two strings to concatenate
        String str1 = "Hello, ";
        String str2 = "World!";

        // Lambda expression to concatenate two strings
        BiFunction<String, String, String> concatenateStrings = (s1, s2) -> s1 + s2;

        // Concatenate the strings using the lambda expression
        String result = concatenateStrings.apply(str1, str2);

        // Print the result
        System.out.println("Concatenated String: " + result);
    }



	}


