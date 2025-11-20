import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: miniMaxSum
     * Purpose: Finds min and max sum of 4 elements in an array of 5.
     * Note: Uses 'long' to prevent integer overflow.
     */
    public static void miniMaxSum(List<Integer> arr) {
        // 1. Sort the list ascending
        Collections.sort(arr);

        long maxNumber = 0;
        long minNumber = 0;

        // 2. Calculate Max Sum (Sum of last 4 elements: indices 1, 2, 3, 4)
        for(int i = 1; i < 5; i++){
            maxNumber += arr.get(i);
        }

        // 3. Calculate Min Sum (Sum of first 4 elements: indices 0, 1, 2, 3)
        for(int i = 0; i < 4; i++){
            minNumber += arr.get(i);
        }

        // 4. Print result
        System.out.println(minNumber + " " + maxNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        // Input logic handled by HackerRank usually, but good for local test
        for (int i = 0; i < 5; i++) {
            if(scanner.hasNextInt()) arr.add(scanner.nextInt());
        }
        miniMaxSum(arr);
    }
}
