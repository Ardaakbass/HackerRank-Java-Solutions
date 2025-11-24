import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: rotateLeft
     * Purpose: Rotates the array to the left by d steps.
     * Logic: Split array at index d. Append first part to the end of second part.
     */
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        List<Integer> result = new ArrayList<>();

        // 1. Add elements from index 'd' to the end (The remaining part)
        for (int i = d; i < arr.size(); i++) {
            result.add(arr.get(i));
        }

        // 2. Add elements from index '0' to 'd' (The rotated part)
        for (int j = 0; j < d; j++) {
            result.add(arr.get(j));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input handling
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            if(scanner.hasNextInt()) arr.add(scanner.nextInt());
        }
        
        List<Integer> result = rotateLeft(d, arr);
        
        // Print result
        for(int num : result) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
