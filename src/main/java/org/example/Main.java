package org.example;

public class Main {
        public static int sum(int[] numbers) {
            /*
            Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element
            ( by value, not by index!).
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
            if (numbers == null || numbers.length <= 2) {
                return 0;
            } else {
                // 1. find max and min
                // variables to store max, min and sum
                int sum, max, min;
                // 2. sum all numbers
                // initialize sum, max and min with first element
                sum = max = min = numbers[0];
                // loop through the array
                for (int number : numbers) {
                    if (number > max) {
                        max = number;
                    }
                    if (number < min) {
                        min = number;
                    }
                    sum += number;
                }
                // 3. return sum - max - min
                return sum - max - min;
            }

        }
    public static void main(String[] args) {
        int[] numbers = { 6, 2, 1, 8, 10 };
        System.out.println(sum(numbers));
    }
}