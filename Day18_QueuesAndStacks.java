import java.io.*;
import java.util.*;

public class Solution {
    // 1. Create Stack and Queue
    // Stack uses LIFO (Last-In-First-Out)
    Stack<Character> stack = new Stack<>();
    
    // Queue uses FIFO (First-In-First-Out). Since Queue is an interface, we use LinkedList.
    Queue<Character> queue = new LinkedList<>();

    // 2. Methods
    
    // Pushes a character onto a stack.
    void pushCharacter(char c) {
        stack.push(c);
    }
    
    // Enqueues a character in the queue instance.
    void enqueueCharacter(char c) {
        queue.add(c);
    }
    
    // Pops and returns the character at the top of the stack instance.
    char popCharacter() {
        return stack.pop();
    }
    
    // Dequeues and returns the first character in the queue instance.
    char dequeueCharacter() {
        return queue.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
