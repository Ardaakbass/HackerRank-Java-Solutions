import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Function: gradingStudents
     * Purpose: Rounds grades according to specific rules.
     */
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Iterate through the list using index 'i' to modify the original list
        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);
            
            // Rule 1: If grade is less than 38, no rounding occurs.
            if (grade < 38) {
                continue; // Skip to the next student
            } else {
                // Rule 2: Calculate rounding logic
                int remainder = grade % 5;
                int difference = 5 - remainder;
                
                // If the difference is less than 3, round up
                if (difference < 3) {
                    int newGrade = grade + difference;
                    grades.set(i, newGrade); // Update the grade in the list
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Integer> grades = new ArrayList<>();
        for(int i=0; i<count; i++){
            if(scanner.hasNextInt()) grades.add(scanner.nextInt());
        }
        
        List<Integer> result = gradingStudents(grades);
        for (int g : result) {
            System.out.println(g);
        }
        scanner.close();
    }
}
