import java.util.*;

class Printer <T> {
    /**
    * Method Name: printArray
    * Description: A generic method to print elements of an array of any type.
    * @param inputArray: A generic array (Integer[], String[], etc.)
    **/
    public <E> void printArray(E[] inputArray) {
        // Iterate through each element in the generic array
        for (E element : inputArray) {
            System.out.println(element);
        }
    }
}

public class Solution {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading Integer Array
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        // Reading String Array
        int m = scanner.nextInt();
        String[] stringArray = new String[m];
        for (int i = 0; i < m; i++) {
            stringArray[i] = scanner.next();
        }

        // Creating generic Printer objects
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        
        // Calling the generic method
        intPrinter.printArray(intArray);
        stringPrinter.printArray(stringArray);
        
        // Validation (HackerRank logic check)
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    }
}
