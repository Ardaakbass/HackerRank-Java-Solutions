import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: bonAppetit
     * Purpose: Calculate if the bill split is fair.
     */
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int totalSum = 0;
        
        // For-Each Loop: Iterate directly over values
        for (int price : bill) {
            totalSum += price;
        }
        
        // Calculate fair share: (Total - Uneaten Item) / 2
        int annaShare = (totalSum - bill.get(k)) / 2;

        if (b == annaShare) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - annaShare);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> bill = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(scanner.hasNextInt()) bill.add(scanner.nextInt());
        }
        int b = scanner.nextInt();
        
        bonAppetit(bill, k, b);
        scanner.close();
    }
}
