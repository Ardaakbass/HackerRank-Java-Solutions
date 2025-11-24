import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: divisibleSumPairs
     * Purpose: Counts pairs (i, j) where i < j and their sum is divisible by k.
     */
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        
        // Iterate through the list
        for(int i = 0; i < ar.size(); i++) {
            // Pair with subsequent elements only (i < j)
            for(int j = i + 1; j < ar.size(); j++) {
                
                // Check divisibility condition
                // Parentheses (a + b) are crucial here for correct precedence!
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> ar = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            if(scanner.hasNextInt()) ar.add(scanner.nextInt());
        }
        
        System.out.println(divisibleSumPairs(n, k, ar));
        scanner.close();
    }
}
