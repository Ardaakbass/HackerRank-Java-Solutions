import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: factorial
     * Purpose: Calculate factorial of a number using recursion.
     * Logic: n! = n * (n-1)! 
     * Base Case: if n <= 1, return 1.
     */
    public static int factorial(int n) {
        // 1. Base Case: Stop condition
        if (n <= 1) {
            return 1;
        }
        // 2. Recursive Step: Function calls itself
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = scanner.nextInt();
        
        // Calculate and print result
        int result = factorial(n);
        System.out.println(result);
        
        scanner.close();
    }
}
