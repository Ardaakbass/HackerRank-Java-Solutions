import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Problem: QHEAP1 (Basic Heap Operations)
         * Goal: Implement a Min-Heap with Add, Delete, and Print Minimum operations.
         * Solution: Using Java's built-in PriorityQueue which acts as a Min-Heap.
         */
        Scanner scanner = new Scanner(System.in);
        
        // Check if input exists to avoid runtime errors
        if (!scanner.hasNext()) return;
        
        int q = scanner.nextInt();
        
        // PriorityQueue in Java orders elements in natural ascending order (Min-Heap)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int i = 0; i < q; i++) {
            int type = scanner.nextInt();
            
            if (type == 1) {
                // ADD operation
                // Complexity: O(log n)
                int val = scanner.nextInt();
                minHeap.add(val);
                
            } else if (type == 2) {
                // DELETE operation
                // Complexity: O(n) because it requires a linear scan to find the element
                int val = scanner.nextInt();
                minHeap.remove(val);
                
            } else if (type == 3) {
                // PRINT MINIMUM operation
                // Complexity: O(1) - The root is always the minimum element
                System.out.println(minHeap.peek());
            }
        }
        
        scanner.close();
    }
}
