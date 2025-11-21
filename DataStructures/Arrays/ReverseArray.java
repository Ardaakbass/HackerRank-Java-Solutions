import java.io.*;
import java.util.*;

class Result {
    /*
     * Function: reverseArray
     * Purpose: Reverses an integer array.
     * Logic: Uses 'Two-Pointer Swap' technique.
     */
    public static List<Integer> reverseArray(List<Integer> a) {
        int start = 0;
        int end = a.size() - 1;
        
        while(start < end) {
            // Swap logic
            int temp = a.get(start);
            a.set(start, a.get(end));
            a.set(end, temp);
            
            // Move pointers
            start++;
            end--;
        } 
        return a;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        // HackerRank input handling logic
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            arr.add(Integer.parseInt(arrTemp[i]));
        }

        List<Integer> res = Result.reverseArray(arr);

        for (int i = 0; i < res.size(); i++) {
            bufferedWriter.write(String.valueOf(res.get(i)));
            if (i != res.size() - 1) {
                bufferedWriter.write(" ");
            }
        }
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
