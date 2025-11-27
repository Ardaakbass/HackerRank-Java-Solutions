import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    /*
     * Task: Day 3 - Intro to Conditional Statements
     * Logic: Determine if a number is "Weird" or "Not Weird" based on odd/even status and inclusive ranges.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input integer 'N'
        int N = scanner.nextInt();
        
        // Skip to the end of the line to avoid input issues
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // 1. Check if N is ODD (Tek Sayı)
        if (N % 2 != 0) {
            System.out.println("Weird");
        } 
        // 2. If N is EVEN (Çift Sayı)
        else {
            // Range: 2 to 5 (Inclusive)
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } 
            // Range: 6 to 20 (Inclusive)
            else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } 
            // Range: Greater than 20
            else if (N > 20) {
                System.out.println("Not Weird");
            }
        }

        scanner.close();
    }
}
