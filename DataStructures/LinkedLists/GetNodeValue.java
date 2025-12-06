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
     * Function: getNode
     * Purpose: Get the value of the node at a specific position from the tail.
     * Logic: 
     * 1. Traverse the list to count the total number of nodes.
     * 2. Calculate the target index from the start using the formula:
     * TargetIndex = TotalCount - 1 - PositionFromTail
     * 3. Traverse the list again from the head to the TargetIndex.
     * 4. Return the data at that node.
     */
    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        int count = 0;
        SinglyLinkedListNode current = llist;
        
        // Step 1: Count total nodes
        while (current != null) {
            current = current.next;
            count++;
        }
        
        // Step 2: Calculate target index from start
        int targetIndex = count - 1 - positionFromTail;
        
        // Step 3: Traverse to the target node
        current = llist; // Reset to head
        for (int i = 0; i < targetIndex; i++) {
            current = current.next;
        }
        
        // Step 4: Return value
        return current.data;
    }

    // Main method for testing
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

            int position = scanner.nextInt();
            
            // Call the function
            int result = getNode(llist.head, position);
            System.out.println(result);
        }
        scanner.close();
    }
}
