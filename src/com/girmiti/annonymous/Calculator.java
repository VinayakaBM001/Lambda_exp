package com.girmiti.annonymous;
import java.util.Scanner;
public class Calculator {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the first operand
System.out.print("Enter the first number: ");
double operand1 = scanner.nextDouble(); //method to read a double value from the user's input and assigns it to the variable operand1.
       // Input the operation
System.out.print("Enter the operation (+, -, *, /, %): ");
char operation = scanner.next().charAt(0); // scanner.next().charAt(0) method to read a string from the user's input, then extracts the first character (at index 0) to get the operation as a char.
      // Input the second operand
System.out.print("Enter the second number: ");
double operand2 = scanner.nextDouble(); //method to read a double value from the user's input and assigns it to the variable operand2.
         // Perform the calculation based on the selected operation
        double result = 0;
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                }  break;
            case '%':
                if (operand2 != 0) {
                    result = operand1 % operand2;
                } 
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return; // Terminate the program
        }
           // Display the result
        System.out.println("Result: " + result);
           // Close the scanner
        scanner.close();
    }

}


