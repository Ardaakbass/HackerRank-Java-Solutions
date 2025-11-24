import java.io.*;
import java.util.*;

public class Solution {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int minScore = scores.get(0);
        int maxScore = scores.get(0);
        int minCount = 0;
        int maxCount = 0;
        
        // Iterate through all scores starting from the second game
        for(int i = 1; i < scores.size(); i++){
            int score = scores.get(i);
            
            if(score > maxScore){
                maxScore = score;
                maxCount++;
            }
            
            if(score < minScore){
                minScore = score;
                minCount++;
            }
        }
        return Arrays.asList(maxCount, minCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> scores = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(scanner.hasNextInt()) scores.add(scanner.nextInt());
        }
        
        List<Integer> result = breakingRecords(scores);
        System.out.println(result.get(0) + " " + result.get(1));
        scanner.close();
    }
}
