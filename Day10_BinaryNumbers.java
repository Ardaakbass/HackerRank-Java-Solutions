import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Task: Day 10 - Binary Numbers
     * Purpose: Convert a base-10 integer to binary and find the maximum number of consecutive 1's.
     * Logic: 
     * - Use modulo 2 to get binary digits.
     * - If digit is 1, increment counter.
     * - If digit is 0, reset counter.
     * - Track the maximum count found.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the integer n
        int n = scanner.nextInt();
        scanner.close(); // Good practice to close scanner
        
        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;
        
        // Loop while n is greater than 0
        while (n > 0) {
            int remainder = n % 2; // Get the binary digit (0 or 1)
            
            if (remainder == 1) {
                currentConsecutiveOnes++; // Found a 1, increase chain
                
                // Update max if current chain is longer
                if (currentConsecutiveOnes > maxConsecutiveOnes) {
                    maxConsecutiveOnes = currentConsecutiveOnes;
                }
            } else {
                currentConsecutiveOnes = 0; // Found a 0, break the chain
            }
            
            // Move to the next bit (Divide by 2)
            n = n / 2;
        }
        
        System.out.println(maxConsecutiveOnes);
    }
}
