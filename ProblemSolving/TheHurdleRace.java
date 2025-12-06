import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: hurdleRace
     * Purpose: Calculate minimum doses of potion needed to jump all hurdles.
     * Logic: Find the max height hurdle. If max > k, return (max - k), else 0.
     */
    public static int hurdleRace(int k, List<Integer> height) {
        int maxHeight = 0;
        
        // 1. Find the tallest hurdle
        for (int h : height) {
            if (h > maxHeight) {
                maxHeight = h;
            }
        }
        
        // 2. Calculate potion needed
        // If the hurdle is higher than my jump height (k), I need potion.
        if (maxHeight > k) {
            return maxHeight - k;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        List<Integer> height = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                height.add(scanner.nextInt());
            }
        }
        
        System.out.println(hurdleRace(k, height));
        scanner.close();
    }
}
