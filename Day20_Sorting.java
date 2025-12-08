import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Reading the size of the array
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        // Reading the array elements as a String array
        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // Converting String array to Integer List
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        // --- Bubble Sort Algorithm ---
        int totalSwaps = 0;

        for (int i = 0; i < n; i++) {
            // Track number of swaps for this pass
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j + 1)) {
                    
                    // Swap operation using List .set() method
                    int temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);

                    numberOfSwaps++;
                    totalSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }

        // --- Output Results ---
        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n - 1));

        bufferedReader.close();
    }
}
