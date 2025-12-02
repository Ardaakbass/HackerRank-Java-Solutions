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
     * Function: compareLists
     * Purpose: Compares two linked lists to see if they are identical.
     * Logic: 
     * - Traverse both lists simultaneously.
     * - If data differs at any point, return false.
     * - If traversal ends, check if both are null (same length).
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        // 1. Traverse while both lists have data
        while (head1 != null && head2 != null) {
            // Check data equality
            if (head1.data != head2.data) {
                return false;
            }
            // Move to next nodes
            head1 = head1.next;
            head2 = head2.next;
        }

        // 2. Check length equality
        // Both must be null for lists to be identical
        if (head1 == null && head2 == null) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();

        for (int t = 0; t < tests; t++) {
            SinglyLinkedList llist1 = new SinglyLinkedList();
            int llist1Count = scanner.nextInt();
            for (int i = 0; i < llist1Count; i++) {
                llist1.insertNode(scanner.nextInt());
            }

            SinglyLinkedList llist2 = new SinglyLinkedList();
            int llist2Count = scanner.nextInt();
            for (int i = 0; i < llist2Count; i++) {
                llist2.insertNode(scanner.nextInt());
            }

            boolean result = compareLists(llist1.head, llist2.head);
            System.out.println(result ? 1 : 0);
        }
        scanner.close();
    }
}
