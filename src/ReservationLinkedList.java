/**
 * CLASS - ReservationLinkedList
 *
 * Use Case 8: Linked List Based Reservation Handling
 *
 * Demonstrates:
 * - Linked List traversal
 * - Reversal logic
 * - Symmetry check (palindrome style)
 */

public class ReservationLinkedList {

    // Node structure
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Add reservation
    public void add(String data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Display list
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // Check palindrome using linked list logic
    public boolean isPalindrome() {

        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find middle (slow-fast pointer)
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node prev = null;
        Node curr = slow;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare both halves
        Node first = head;
        Node second = prev;

        while (second != null) {

            if (!first.data.equals(second.data)) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;
    }
}