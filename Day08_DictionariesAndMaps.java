import java.util.*;
import java.io.*;

class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
        // 1. Read amount of entries
        int n = in.nextInt();
        
        // 2. Create the Phone Book (Map)
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        
        // 3. Add entries to the Map
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        
        // 4. Process queries
        while(in.hasNext()){
            String s = in.next();
            
            if(phoneBook.containsKey(s)){
                // If found, print name=number
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                // If not found, print "Not found" (Without extra space!)
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
