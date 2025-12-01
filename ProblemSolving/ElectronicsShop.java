import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: getMoneySpent
     * Purpose: Find the maximum amount of money that can be spent on a keyboard and USB drive without exceeding the budget.
     * Logic: Brute-force all combinations. If a combination is within budget and higher than current max, update max.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxSpent = -1; // Default return value if no combination is affordable

        // 1. Iterate through all keyboards
        for (int i = 0; i < keyboards.length; i++) {
            
            // 2. Iterate through all drives
            for (int j = 0; j < drives.length; j++) {
                
                int cost = keyboards[i] + drives[j]; // Calculate total cost
                
                // 3. Check conditions:
                // - Cost must be less than or equal to budget (b)
                // - Cost must be greater than current found max
                if (cost <= b && cost > maxSpent) {
                    maxSpent = cost;
                }
            }
        }
        
        return maxSpent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt(); // Budget
        int n = scanner.nextInt(); // Number of keyboards
        int m = scanner.nextInt(); // Number of drives
        
        int[] keyboards = new int[n];
        for (int i = 0; i < n; i++) {
            keyboards[i] = scanner.nextInt();
        }
        
        int[] drives = new int[m];
        for (int i = 0; i < m; i++) {
            drives[i] = scanner.nextInt();
        }
        
        // Calculate and print the result
        int moneySpent = getMoneySpent(keyboards, drives, b);
        System.out.println(moneySpent);
        
        scanner.close();
    }
}
