import java.io.*;
import java.util.*;

public class Solution {

    // Node class definition
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    // Linked List wrapper class
    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }
    }

    /*
     * Function: insertNodeAtTail
     * Purpose: Inserts a new node with the given data at the end (tail) of the Linked List.
     * Logic: 
     * - If the list is empty (head is null), the new node becomes the head.
     * - Otherwise, traverse to the last node (where next is null) and append the new node.
     * * @param head - The head node of the linked list
     * @param data - The integer data to insert
     * @return - The reference to the head node
     */
    public static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        // Case 1: The list is empty
        if (head == null) {
            return newNode;
        }

        // Case 2: The list is not empty
        // Traverse to the last node
        SinglyLinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Link the new node to the last node
        current.next = newNode;

        return head;
    }

    // Main method to handle input and execution
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            // We use our function to insert elements
            llist.head = insertNodeAtTail(llist.head, llistItem);
        }

        printSinglyLinkedList(llist.head);
        scanner.close();
    }

    // Helper function to print the list
    public static void printSinglyLinkedList(SinglyLinkedListNode node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
