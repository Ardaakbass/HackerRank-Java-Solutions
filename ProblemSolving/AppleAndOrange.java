import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: countApplesAndOranges
     * Purpose: Calculate how many apples and oranges fall on Sam's house.
     * Logic: Checks if (TreeLocation + Distance) falls within range [s, t].
     */
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int appleCount = 0;
        int orangeCount = 0;

        // 1. Count Apples
        for (int app : apples) {
            int landingPosition = a + app; // Calculate where the apple falls
            if (landingPosition >= s && landingPosition <= t) {
                appleCount++;
            }
        }

        // 2. Count Oranges
        for (int oor : oranges) {
            int landingPosition = b + oor; // Calculate where the orange falls
            if (landingPosition >= s && landingPosition <= t) {
                orangeCount++;
            }
        }

        // 3. Print results
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Inputs provided by HackerRank
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        List<Integer> apples = new ArrayList<>();
        for(int i=0; i<m; i++) apples.add(scanner.nextInt());
        
        List<Integer> oranges = new ArrayList<>();
        for(int i=0; i<n; i++) oranges.add(scanner.nextInt());
        
        countApplesAndOranges(s, t, a, b, apples, oranges);
        scanner.close();
    }
}
