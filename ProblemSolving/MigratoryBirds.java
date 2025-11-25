import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: migratoryBirds
     * Purpose: Finds the most frequently sighted bird type ID.
     * Logic: Uses a frequency array (bucket sort approach) since IDs are small (1-5).
     * Tie-Breaker: If frequencies are equal, the smaller ID wins.
     */
    public static int migratoryBirds(List<Integer> arr) {
        // 1. Create buckets for bird types 1 through 5
        // We use size 6 to accommodate index 5 directly.
        int[] count = new int[6];

        // 2. Count each bird sighting
        for (int i = 0; i < arr.size(); i++) {
            int birdId = arr.get(i);
            count[birdId]++;
        }

        // 3. Find the bird ID with the maximum frequency
        int maxFrequency = 0;
        int winnerId = 0;

        for (int i = 1; i <= 5; i++) {
            // Use '>' instead of '>=' to handle the tie-breaker rule.
            // If counts are equal, we keep the current (smaller) ID as winner.
            if (count[i] > maxFrequency) {
                maxFrequency = count[i];
                winnerId = i;
            }
        }
        
        return winnerId;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input handling
        int arrCount = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < arrCount; i++) {
            if (scanner.hasNextInt()) {
                arr.add(scanner.nextInt());
            }
        }

        int result = migratoryBirds(arr);
        System.out.println(result);
        
        scanner.close();
    }
}
