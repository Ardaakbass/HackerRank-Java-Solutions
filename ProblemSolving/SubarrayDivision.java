import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: birthday
     * Purpose: Find how many ways we can divide the chocolate bar.
     * Logic: Sliding Window technique. Iterate 'i' up to (size - m).
     */
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        
        // Iterate through the list, stopping early to avoid index out of bounds
        // Limit: s.size() - m
        for(int i = 0; i <= s.size() - m; i++) {
            int currentSum = 0; // Reset sum for each window
            
            // Sum the next 'm' elements (The Window)
            for(int j = 0; j < m; j++) {
                currentSum += s.get(i + j);
            }
            
            // Check if sum matches Ron's birth day (d)
            if(currentSum == d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of squares (not strictly needed for Logic)
        List<Integer> s = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(scanner.hasNextInt()) s.add(scanner.nextInt());
        }
        int d = scanner.nextInt(); // Day
        int m = scanner.nextInt(); // Month
        
        System.out.println(birthday(s, d, m));
        scanner.close();
    }
}
