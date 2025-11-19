import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: diagonalDifference
     * Purpose: Calculates the absolute difference between the sums of its diagonals.
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        // 1. Initialize variables
        int leftToRightSum = 0;
        int rightToLeftSum = 0;
        
        // 2. Get the size of the matrix
        int n = arr.size(); 
            
        // 3. Iterate through the matrix
        for(int i = 0; i < n; i++){
            // Primary Diagonal (sol üstten sağ alta)
            leftToRightSum += arr.get(i).get(i);
            
            // Secondary Diagonal (sağ üstten sol alta)
            rightToLeftSum += arr.get(i).get(n - 1 - i);
        }
        
        // 4. Return absolute difference
        return Math.abs(leftToRightSum - rightToLeftSum);
    }
}
