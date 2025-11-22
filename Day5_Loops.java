import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    /*
     * Task: Day 5 - Loops
     * Purpose: Print the first 10 multiples of n (format: n x i = result).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the integer n
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // Loop from 1 to 10
        for(int i = 1; i <= 10; i++){
            int result = n * i;
            
            // Print formatted output with spaces
            // Example: 2 x 1 = 2
            System.out.println(n + " x " + i + " = " + result);
        }

        scanner.close();
    }
}
