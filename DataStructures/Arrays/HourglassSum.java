import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: hourglassSum
     * Purpose: Finds the maximum sum of an hourglass pattern in a 2D array.
     * Time Complexity: O(N*M) - Iterates through the matrix once.
     */
    public static int hourglassSum(List<List<Integer>> arr) {
        // 1. Initialize max with the smallest possible value to handle negative sums
        int maxSum = Integer.MIN_VALUE;

        // 2. Iterate through the matrix
        // We stop at index 3 (limit is 4) because the hourglass height is 3.
        // Formula: limit = size - hourglass_size + 1 (6 - 3 + 1 = 4)
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                
                // 3. Calculate the sum of the hourglass shape
                // Top row (3 elements)
                int top = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2);
                
                // Middle (1 element)
                int mid = arr.get(i+1).get(j+1);
                
                // Bottom row (3 elements)
                int bot = arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                
                int currentSum = top + mid + bot;
                
                // 4. Update maximum sum found so far
                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> arr = new ArrayList<>();

        // Input handling for 6x6 2D Array
        for (int i = 0; i < 6; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                if(scanner.hasNextInt()) row.add(scanner.nextInt());
            }
            arr.add(row);
        }
        
        System.out.println(hourglassSum(arr));
        scanner.close();
    }
}
