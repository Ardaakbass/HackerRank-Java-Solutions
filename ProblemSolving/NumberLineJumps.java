import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: kangaroo
     * Purpose: Checks if two kangaroos will land on the same location at the same time.
     * Logic: 
     * 1. If kangaroo 1 (behind) is slower, it never catches up.
     * 2. If the distance gap is divisible by the speed difference, they meet.
     */
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // 1. Speed Check: If back kangaroo is slower or equal, impossible.
        if(v1 <= v2) {
            return "NO";
        }
        
        // 2. Modulo Check: Can the distance be covered in exact jumps?
        // (x2 - x1) is the distance gap.
        // (v1 - v2) is the catch-up speed per jump.
        if((x2 - x1) % (v1 - v2) == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // HackerRank input format
        int x1 = scanner.nextInt();
        int v1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int v2 = scanner.nextInt();
        
        System.out.println(kangaroo(x1, v1, x2, v2));
        scanner.close();
    }
}
