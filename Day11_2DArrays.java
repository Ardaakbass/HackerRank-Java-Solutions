import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> arr = new ArrayList<>();

        // 1. Read the 6x6 2D Array
        for (int i = 0; i < 6; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                if (scanner.hasNextInt()) {
                    row.add(scanner.nextInt());
                }
            }
            arr.add(row);
        }
        
        // 2. Calculate Maximum Hourglass Sum
        // Initialize with minimum possible integer to handle negative sums correctly
        int maxSum = Integer.MIN_VALUE;

        // Iterate through the array
        // We stop at index 3 (i < 4) because an hourglass requires 3 rows/cols.
        // Accessing index 4+2 would cause IndexOutOfBoundsException (since max index is 5).
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                // Calculate the sum of the hourglass shape:
                // a b c
                //   d
                // e f g
                
                int top = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2);
                int mid = arr.get(i+1).get(j+1);
                int bot = arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                
                int currentSum = top + mid + bot;
                
                // Update max sum if current is larger
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        
        // Print the result
        System.out.println(maxSum);
        
        scanner.close();
    }
}
