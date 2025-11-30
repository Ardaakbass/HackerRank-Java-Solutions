import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: countingValleys
     * Purpose: Count the number of valleys traversed.
     * Logic: A valley is completed when we step UP ('U') and reach sea level (altitude 0).
     */
    public static int countingValleys(int steps, String path) {
        int altitude = 0;
        int valleys = 0;

        // Iterate through each step in the path
        for (char step : path.toCharArray()) {
            // Update altitude
            if (step == 'U') {
                altitude++;
            } else {
                altitude--;
            }

            // Check if we just climbed out of a valley
            // We must be stepping UP and landing at sea level (0)
            if (step == 'U' && altitude == 0) {
                valleys++;
            }
        }
        return valleys;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = scanner.nextInt();
        String path = scanner.next();
        
        System.out.println(countingValleys(steps, path));
        scanner.close();
    }
}
