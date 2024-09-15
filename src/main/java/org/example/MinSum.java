package org.example;

import java.util.Arrays;

public class MinSum {
    public static void main(String[] args) {
        int k = 3;  // number of operations
        int[] num = new int[]{10, 10, 20};

        // Apply k operations for each individual number in the array
        for (int i = 0; i < num.length; i++) {
            System.out.println("Initial value for num[" + i + "]: " + num[i]);

            // Perform k operations for the current number
            int operations = k;  // Reset operations count for each number
            while (operations > 0) {
                num[i] = (int) Math.ceil(num[i] / 2.0);  // Divide by 2 and round up
                operations--;  // Decrement operations counter
            }

            System.out.println("After " + k + " operations: " + num[i]);
        }

        // Print the final output after all operations
        System.out.println("Final output: " + Arrays.toString(num));
    }
}
