import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: pageCount
     * Purpose: Calculate the minimum number of page turns to get to page p.
     * Logic: 
     * - From Front: p / 2
     * - From Back: (n / 2) - (p / 2)
     * - Return Minimum.
     */
    public static int pageCount(int n, int p) {
        // Calculate turns from the front
        int front = p / 2;
        
        // Calculate turns from the back
        // Formula: (Total Turns in Book) - (Target Page Turns)
        int back = (n / 2) - (p / 2);
        
        // Return the minimum of the two
        return Math.min(front, back);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Total pages
        int p = scanner.nextInt(); // Target page
        
        System.out.println(pageCount(n, p));
        scanner.close();
    }
}
