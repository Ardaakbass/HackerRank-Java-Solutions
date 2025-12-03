import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Task: Day 16 - Exceptions - String to Integer
     * Purpose: Read a string and try to convert it to an integer.
     * Logic: 
     * - Use a try-catch block to handle the potential NumberFormatException.
     * - If successful, print the integer.
     * - If an exception occurs (string is not a valid number), print "Bad String".
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        in.close(); // Close the scanner to prevent resource leaks
        
        try {
            // Attempt to parse the string S to an integer
            int number = Integer.parseInt(S);
            
            // If successful, print the number
            System.out.println(number);
            
        } catch (NumberFormatException e) {
            // If parsing fails (S is not a number), catch the exception
            System.out.println("Bad String");
        }
    }
}
