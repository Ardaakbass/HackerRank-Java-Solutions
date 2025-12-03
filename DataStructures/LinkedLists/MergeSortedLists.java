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
     * Function: mergeLists
     * Purpose: Merges two sorted linked lists into a single sorted linked list.
     * Logic: 
     * - Compare heads of both lists.
     * - Attach the smaller node to the new list's tail.
     * - Move the pointer of the chosen list forward.
     * - Repeat until one list is empty, then attach the remainder of the other list.
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        // 1. Create a dummy node to start the new list
        SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);
        SinglyLinkedListNode tail = dummy;

        // 2. Traverse both lists
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        // 3. Attach remaining nodes
        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        // 4. Return the head of the merged list (skipping dummy)
        return dummy.next;
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
            if (node != null) {
                System.out.print(sep);
            }
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

            SinglyLinkedListNode llist3 = mergeLists(llist1.head, llist2.head);
            printSinglyLinkedList(llist3, " ");
            System.out.println();
        }
        scanner.close();
    }
}
