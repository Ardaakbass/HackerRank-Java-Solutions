import java.io.*;
import java.util.*;

public class Solution {

    // HackerRank'in arka planda gizlediği Vagon Sınıfı (Bunu eklemeliyiz)
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    /*
     * Function: printLinkedList
     * Purpose: Prints the elements of a linked list.
     * Logic: Traverse the list until the current node is null.
     */
    static void printLinkedList(SinglyLinkedListNode head) {
        // 1. Start from the head
        SinglyLinkedListNode current = head;
        
        // 2. Loop until the end of the train (null)
        while (current != null) {
            // Print the cargo (data)
            System.out.println(current.data);
            
            // Move to the next wagon
            current = current.next;
        }
    }
}
