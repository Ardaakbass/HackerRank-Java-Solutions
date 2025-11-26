import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: dayOfProgrammer
     * Purpose: Find the date of the 256th day of the year in Russia.
     * Logic: Handles Julian (pre-1918), Gregorian (post-1918), and the transition year (1918).
     */
    public static String dayOfProgrammer(int year) {
        // 1. Transition Year (Special Case)
        // In 1918, days from Feb 1 to Feb 13 were skipped.
        if (year == 1918) {
            return "26.09.1918";
        } 
        // 2. Julian Calendar (1700 - 1917)
        // Leap year rule: Divisible by 4
        else if (year < 1918) {
            if (year % 4 == 0) {
                return "12.09." + year; // Leap Year
            } else {
                return "13.09." + year; // Normal Year
            }
        } 
        // 3. Gregorian Calendar (1919 - Present)
        // Leap year rule: Divisible by 400 OR (Divisible by 4 AND NOT by 100)
        else {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                return "12.09." + year; // Leap Year
            } else {
                return "13.09." + year; // Normal Year
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(dayOfProgrammer(year));
        scanner.close();
    }
}
