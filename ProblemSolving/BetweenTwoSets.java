import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: getTotalX
     * Purpose: Finds the count of integers that satisfy two conditions (LCM/GCD logic).
     */
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int count = 0;
        
        // Iterate through candidate numbers (1 to 100)
        for(int i = 1; i <= 100; i++){
            boolean isOK = true; // Flag: Assume innocent until proven guilty
            
            // 1. Check if 'i' is a multiple of elements in A
            // i must be BIGGER than elements in A -> (i % numA)
            for(int numA : a){
                if(i % numA != 0){
                    isOK = false;
                    break;
                }
            }
            
            // 2. Check if 'i' is a factor of elements in B (only if passed step 1)
            // i must be SMALLER than elements in B -> (numB % i)
            if(isOK){
                for(int numB : b){
                    if(numB % i != 0){
                        isOK = false;
                        break;
                    }
                }
            }
            
            // If passed both juries
            if(isOK){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Standard HackerRank input handling
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        List<Integer> a = new ArrayList<>();
        for(int i=0; i<n; i++) if(scanner.hasNextInt()) a.add(scanner.nextInt());
        
        List<Integer> b = new ArrayList<>();
        for(int i=0; i<m; i++) if(scanner.hasNextInt()) b.add(scanner.nextInt());
        
        System.out.println(getTotalX(a, b));
        scanner.close();
    }
}
