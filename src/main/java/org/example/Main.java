package org.example;

public class Main {
        public static int sum(int[] numbers) {
            /*
            Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element
            ( by value, not by index! ).
            The highest or lowest element respectively is a single element at each edge,
            even if there are more than one with the same value.
            Mind the input validation.
            Example
            { 6, 2, 1, 8, 10 } => 16
            { 1, 1, 11, 2, 3 } => 6
            Input validation
            If an empty value ( null, None, Nothing etc. ) is given instead of an array,
            or the given array is an empty list or a list with only 1 element, return 0.
             */
            // If the array is null or has only one element, return 0
            if (numbers == null || numbers.length <= 1) {
                return 0;
                // If the array two or more elements, return the sum of the two elements
            } else {
                // Initialize the sum, max and min variables
                int sum = 0;
                int max = numbers[0];
                int min = numbers[0];
                // Loop through the array and find the max, min and sum
                for (int number : numbers) {
                    if (number > max) {
                        max = number;
                    }
                    if (number < min) {
                        min = number;
                    }
                    sum += number;
                }
                // Return the sum of the array minus the max and min
                return sum - max - min;
            }

        }
    public static void main(String[] args) {
        int[] numbers = { 6, 2, 1, 8, 10 };
        System.out.println(sum(numbers));
    }
}