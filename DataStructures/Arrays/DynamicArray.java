import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Function: dynamicArray
     * Purpose: Manage dynamic lists (shelves) based on XOR queries.
     */
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // 1. Depoyu (List of Lists) Hazırla
        List<List<Integer>> arr = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            // Her raf için Integer tutan bir liste ekliyoruz
            arr.add(new ArrayList<Integer>());
        }
        
        List<Integer> result = new ArrayList<>();
        int lastAnswer = 0;
        
        // 2. İşlemleri Yap
        for(List<Integer> q : queries){
            int type = q.get(0);
            int x = q.get(1);
            int y = q.get(2);
            
            int idx = (x ^ lastAnswer) % n;
            
            if(type == 1){
                arr.get(idx).add(y);
            } else {
                List<Integer> currentShelf = arr.get(idx);
                int elementIndex = y % currentShelf.size();
                lastAnswer = currentShelf.get(elementIndex);
                result.add(lastAnswer);
            }
        }
        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);
        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> queriesRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }
            queries.add(queriesRowItems);
        }

        List<Integer> result = Result.dynamicArray(n, queries);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
