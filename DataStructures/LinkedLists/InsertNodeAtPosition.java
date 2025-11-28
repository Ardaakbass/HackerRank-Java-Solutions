import java.io.*;
import java.util.*;

public class Solution {

    // Definition for singly-linked list node
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    // Wrapper class for the list
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
     * Function: insertNodeAtPosition
     * Purpose: Inserts a new node at a specific position in the linked list.
     * Logic: 
     * 1. Create the new node.
     * 2. Traverse to the node just BEFORE the target position.
     * 3. Update pointers to insert the new node in between.
     */
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        // Case 1: Inserting at the head (Position 0)
        if (position == 0) {
            newNode.next = llist;
            return newNode;
        }

        // Case 2: Inserting at a specific position
        SinglyLinkedListNode current = llist;
        
        // Traverse to the node at (position - 1)
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        
        // Perform the insertion
        newNode.next = current.next; // 1. New node points to the next node
        current.next = newNode;      // 2. Current node points to the new node
        
        return llist;
    }

    // Main method for testing
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            llist.insertNode(llistItem);
        }

        int data = scanner.nextInt();
        int position = scanner.nextInt();

        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);

        printSinglyLinkedList(llist_head);
        scanner.close();
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
