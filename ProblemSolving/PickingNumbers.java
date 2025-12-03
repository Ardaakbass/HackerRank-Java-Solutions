import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: pickingNumbers
     * Purpose: Find the maximum number of integers that can be chosen such that 
     * the absolute difference between any two is <= 1.
     * Logic: Frequency Array approach. Count occurrences of each number, 
     * then find the max sum of adjacent counts (i and i+1).
     */
    public static int pickingNumbers(List<Integer> a) {
        // 1. Create a frequency array (Constraints say numbers <= 100)
        // Size 101 to handle number '100' at index 100
        int[] frequency = new int[101];
        
        // 2. Count occurrences of each number
        for (int number : a) {
            frequency[number]++;
        }
        
        int maxTeam = 0;
        
        // 3. Iterate to find the best adjacent pair (i and i+1)
        // We go up to length-1 to avoid IndexOutOfBounds when checking i+1
        for (int i = 0; i < frequency.length - 1; i++) {
            int currentTeamSize = frequency[i] + frequency[i+1];
            
            if (currentTeamSize > maxTeam) {
                maxTeam = currentTeamSize;
            }
        }
        
        return maxTeam;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                a.add(scanner.nextInt());
            }
        }
        
        System.out.println(pickingNumbers(a));
        scanner.close();
    }
}
