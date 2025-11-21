import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: timeConversion
     * Purpose: Converts 12-hour AM/PM format to 24-hour military time.
     * Logic: 
     * - 12 AM -> 00
     * - 1 PM to 11 PM -> Add 12 to hours
     * - 12 PM -> Stays 12
     * - Others -> Stay same
     */
    public static String timeConversion(String s) {
        // 1. Extract parts
        String saatKismi = s.substring(0, 2);
        String ortaKismi = s.substring(2, 8);
        String ampm = s.substring(8, 10);
        
        // 2. Convert hour to integer
        int Hours = Integer.parseInt(saatKismi);
        
        // 3. Logic for AM
        if(ampm.equals("AM")){
            if(Hours == 12){
                Hours = 0; // Midnight case
            }
        }
        // 4. Logic for PM
        else if(ampm.equals("PM")) {
            if(Hours != 12){
                Hours += 12; // Afternoon case (e.g., 1 PM -> 13)
            }
        }
        
        // 5. Format back to String (ensure 2 digits) and return
        String newHour = String.format("%02d", Hours);
        return newHour + ortaKismi;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(timeConversion(s));
        scan.close();
    }
}
