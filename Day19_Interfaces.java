import java.io.*;
import java.util.*;

// The Interface
interface AdvancedArithmetic {
   int divisorSum(int n);
}

// Your Solution Class
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;
        
        // Loop from 1 to n to find divisors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

// Main Class to run the code
public class Day19_Interfaces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
