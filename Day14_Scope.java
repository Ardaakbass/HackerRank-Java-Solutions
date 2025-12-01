import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Constructor
    Difference(int[] a) {
        this.elements = a;
    }

    // Calculation Method
    void computeDifference() {
        // Sort the array to easily find min and max
        Arrays.sort(elements);
        
        int min = elements[0];
        int max = elements[elements.length - 1];
        
        // Store the result
        this.maximumDifference = Math.abs(max - min);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
