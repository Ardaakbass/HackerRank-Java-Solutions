import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    /*
     * Function: insert
     * Purpose: Insert a new Node at the tail (end) of the Linked List.
     * Logic:
     * - If head is null, the new node becomes the head.
     * - Else, traverse to the last node and link the new node.
     */
    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        
        // Case 1: Empty list
        if (head == null) {
            return newNode;
        }
        
        // Case 2: Traverse to the end
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        // Link the new node
        current.next = newNode;
        
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
