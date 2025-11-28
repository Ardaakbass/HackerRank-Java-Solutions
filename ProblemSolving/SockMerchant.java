import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: sockMerchant
     * Purpose: Calculate the number of matching pairs of socks.
     * Logic: 
     * - Use a HashSet to store unmatched socks (the "waiting room").
     * - If a sock is already in the set, it means we found a pair -> remove it and count +1.
     * - If not, add it to the set.
     */
    public static int sockMerchant(int n, List<Integer> ar) {
        Set<Integer> colors = new HashSet<>();
        int pairs = 0;

        for (int sock : ar) {
            if (!colors.contains(sock)) {
                // No match found yet, put it in the set
                colors.add(sock);
            } else {
                // Match found! Increment pair count and remove the sock from waiting list
                pairs++;
                colors.remove(sock);
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of socks
        int n = scanner.nextInt();
        
        // Read sock colors
        List<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                ar.add(scanner.nextInt());
            }
        }
        
        // Calculate and print result
        System.out.println(sockMerchant(n, ar));
        
        scanner.close();
    }
}
