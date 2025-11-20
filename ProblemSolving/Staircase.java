import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: staircase
     * Purpose: Prints a right-aligned staircase of size n using '#' symbols.
     * Input: An integer n denoting the size of the staircase.
     */
    public static void staircase(int n) {
        // Iterate through each row from 0 to n-1
        for(int i = 0; i < n; i++){
            
            // 1. Print Spaces
            // We need (n - 1 - i) spaces to push the hashes to the right.
            for(int j = 0; j < n - 1 - i; j++){
                System.out.print(" ");
            }
            
            // 2. Print Hash Symbols (#)
            // We need (i + 1) hashes for the current row.
            for(int x = 0; x <= i; x++){
                System.out.print("#");
            }
            
            // 3. Move to the next line
            // This is essential to start printing the next row below the current one.
            System.out.println();
        }
    }

    // Main method to handle input and execute the function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int n = scanner.nextInt();
            staircase(n);
        }
        scanner.close();
    }
}
