import java.io.*;
import java.util.*;

public class DesignerPDFViewer {

    /*
     * Your solution method
     */
    public static int designerPdfViewer(List<Integer> h, String word) {
        int maxHeight = 0;

        // Iterate through each character of the word
        for (char wor : word.toCharArray()) {
            // Find the height of the current character
            // h is a List, so we use .get() instead of []
            int wordHeight = h.get(wor - 'a');

            // Update maxHeight if current char is taller
            if (maxHeight < wordHeight) {
                maxHeight = wordHeight;
            }
        }

        // Calculate area: width (word length) * max height
        return word.length() * maxHeight;
    }

    /*
     * Main method to test the code
     */
    public static void main(String[] args) {
        // Sample height data for testing (a=1, b=3, c=1, etc.)
        List<Integer> h = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
             // Let's make 'a', 'c', 'e' etc. height 1, and others height 3 for testing
            h.add(i % 2 == 0 ? 1 : 3); 
        }

        String word = "abc";
        
        int result = designerPdfViewer(h, word);
        
        System.out.println("Word: " + word);
        System.out.println("Highlighted Area: " + result);
    }
}
