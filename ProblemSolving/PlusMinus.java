import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    /*
     * Function: plusMinus
     * Purpose: Calculates ratios of positive, negative and zero values.
     * Prints result with 6 decimal places precision.
     */
    public static void plusMinus(List<Integer> arr) {
        // 1. Initialize counters as 'double' to ensure precise division result.
        double positiveCount = 0;
        double negativeCount = 0;
        double zeroCount = 0;

        // 2. Iterate through the list and categorize numbers
        for(int number : arr){
            if(number > 0){
                positiveCount++;
            } else if(number < 0){
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        
        // 3. Print ratios formatted to 6 decimal places using printf
        // %n creates a new line correctly on any platform.
        int n = arr.size();
        System.out.printf("%.6f%n", positiveCount / n);
        System.out.printf("%.6f%n", negativeCount / n);
        System.out.printf("%.6f%n", zeroCount / n);
    }
}
