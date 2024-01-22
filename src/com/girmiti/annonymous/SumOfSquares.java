package com.girmiti.annonymous;

		import java.util.Arrays;
		import java.util.List;

		public class SumOfSquares {

		    public static void main(String[] args) {
		       
		        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		        // Calculate and print the sum of squares of odd numbers
		        int sumOfSquaresOdd = calculateSum(numbers, n -> n % 2 != 0, n -> n * n);
		        System.out.println("Sum of squares of odd numbers: " + sumOfSquaresOdd);

		        // Calculate and print the sum of squares of even numbers
		        int sumOfSquaresEven = calculateSum(numbers, n -> n % 2 == 0, n -> n * n);
		        System.out.println("Sum of squares of even numbers: " + sumOfSquaresEven);
		    }

		    // Function to calculate the sum based on a condition and a mapping function
		    private static int calculateSum(List<Integer> numbers, Condition condition, Mapper mapper) {
		        int sum = 0;
		        for (int number : numbers) {
		            if (condition.test(number)) {
		                sum += mapper.map(number);
		            }
		        }
		        return sum;
		    }

		  
		    // Functional interface for condition
		    interface Condition {
		        boolean test(int number);
		    }

		    // Functional interface for mapping
		    interface Mapper {
		        int map(int number);
		    }
		}


