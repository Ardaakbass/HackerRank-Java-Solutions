import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: catAndMouse
     * Purpose: Determine which cat reaches the mouse first, or if the mouse escapes.
     * Logic: Compare absolute distances |x-z| and |y-z|.
     */
    static String catAndMouse(int x, int y, int z) {
        int distA = Math.abs(x - z);
        int distB = Math.abs(y - z);
        
        if (distA < distB) {
            return "Cat A";
        } else if (distB < distA) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); // Number of queries
        
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            
            System.out.println(catAndMouse(x, y, z));
        }
        scanner.close();
    }
}
