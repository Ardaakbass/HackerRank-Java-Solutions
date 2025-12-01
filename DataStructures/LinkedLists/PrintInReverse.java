import java.io.*;
import java.util.*;

public class Solution {

    // Node definition
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    // Linked List definition
    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    /*
     * Function: reversePrint
     * Purpose: Prints the elements of a linked list in reverse order using recursion.
     * Logic: 
     * - Base case: If head is null, return.
     * - Recursive step: Call function for the next node.
     * - Print step: Print data AFTER the recursive call returns (backtracking).
     */
    public static void reversePrint(SinglyLinkedListNode head) {
        // 1. Base Case: End of the list
        if (head == null) {
            return;
        }
        
        // 2. Recursive Call: Go to the end first
        reversePrint(head.next);
        
        // 3. Print on the way back
        System.out.println(head.data);
    }

    // Main method to handle test cases
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();

        for (int t = 0; t < tests; t++) {
            SinglyLinkedList llist = new SinglyLinkedList();
            int llistCount = scanner.nextInt();

            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                llist.insertNode(llistItem);
            }

            reversePrint(llist.head);
        }
        scanner.close();
    }
}
