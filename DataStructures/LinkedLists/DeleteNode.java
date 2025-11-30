import java.io.*;
import java.util.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

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
     * Function: deleteNode
     * Purpose: Deletes the node at a specific position in the Linked List.
     * Logic:
     * - If position is 0, change head to head.next.
     * - Otherwise, traverse to (position - 1) and skip the next node.
     */
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        // Case 1: Delete head
        if (position == 0) {
            return llist.next;
        }

        // Case 2: Delete node at 'position'
        SinglyLinkedListNode current = llist;
        
        // Traverse to the node just BEFORE the one to be deleted
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }

        // Bypass the node at 'position'
        // Current -> [Node to Delete] -> [Next Node]
        // Becomes: Current ----------> [Next Node]
        current.next = current.next.next;

        return llist;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            llist.insertNode(llistItem);
        }

        int position = scanner.nextInt();

        SinglyLinkedListNode llist1 = deleteNode(llist.head, position);

        printSinglyLinkedList(llist1);
        scanner.close();
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
