import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: aVeryBigSum
     * Purpose: Calculates the sum of an array of large integers.
     * Note: Uses 'long' data type to handle values larger than 32-bit integers.
     */
    public static long aVeryBigSum(List<Long> ar) {
        // 1. Initialize a variable to store the total sum.
        // We strictly use 'long' to prevent "Integer Overflow".
        long sum = 0;

        // 2. Iterate through each number in the list.
        for (long number : ar) {
            // 3. Add the current number to the cumulative sum.
            sum += number;
        }

        // 4. Return the final result.
        return sum;
    }
}
