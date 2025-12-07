import java.io.*;
import java.util.*;

public class FindMergePoint {

    // HackerRank's SinglyLinkedListNode class definition
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    /*
     * YOUR SOLUTION
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode currentOne = head1;
        SinglyLinkedListNode currentTwo = head2;

        while (currentOne != currentTwo) {
            // If pointer 1 reaches end, switch to head 2
            if (currentOne == null) {
                currentOne = head2;
            } else {
                currentOne = currentOne.next;
            }

            // If pointer 2 reaches end, switch to head 1
            if (currentTwo == null) {
                currentTwo = head1;
            } else {
                currentTwo = currentTwo.next;
            }
        }
        // Either one works since they are equal now
        return currentOne.data;
    }

    // Main method to test the logic manually
    public static void main(String[] args) {
        // Create a merge scenario
        // List 1: 1 -> 2 -> 3 \
        //                      -> 7 -> 10 (Merge Point is 7)
        // List 2:      4 -> 5 /
        
        SinglyLinkedListNode node1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode node3 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode node4 = new SinglyLinkedListNode(4);
        SinglyLinkedListNode node5 = new SinglyLinkedListNode(5);
        SinglyLinkedListNode node7 = new SinglyLinkedListNode(7); // Merge Node
        SinglyLinkedListNode node10 = new SinglyLinkedListNode(10);

        // Link List 1
        node1.next = node2;
        node2.next = node3;
        node3.next = node7;
        
        // Link List 2
        node4.next = node5;
        node5.next = node7; // Merge happens here
        
        // Common part
        node7.next = node10;

        int result = findMergeNode(node1, node4);
        System.out.println("Merge Point Data: " + result); // Should print 7
    }
}
