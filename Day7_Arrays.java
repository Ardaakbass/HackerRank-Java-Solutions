import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Read the size of the array
        int n = scanner.nextInt();
        
        // 2. Create and populate the list
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
             arr.add(scanner.nextInt());
        }
        
        // 3. Print elements in reverse order
        // Start from the last index (size - 1) and decrement to 0
        int size = arr.size();
        for(int i = size - 1; i >= 0; i--){
            // Print elements on the same line separated by a space
            System.out.print(arr.get(i) + " ");
        }
        
        scanner.close();
    }
}
