import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine(); // Boşluğu temizle
        
        for(int i = 0; i < T; i++){
            String s = scan.nextLine();
            
            String evenString = "";
            String oddString = "";
            
            // Harfleri Tek/Çift diye ayır
            for(int j = 0; j < s.length(); j++){
                char charr = s.charAt(j);
                if(j % 2 == 0){
                    evenString += charr;
                } else {
                    oddString += charr;
                }
            }
            // Sonucu yazdır
            System.out.println(evenString + " " + oddString);
        }
        scan.close();
    }
}
