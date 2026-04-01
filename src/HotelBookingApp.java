/**
 * MAIN CLASS - HotelBookingApp
 *
 * Staylio Platform
 *
 * Use Case 8: Linked List Reservation Handling
 */

public class HotelBookingApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("          Staylio Platform       ");
        System.out.println("     Smart Hotel Booking System  ");
        System.out.println("           Version 8.0           ");
        System.out.println("=================================");

        ReservationLinkedList list = new ReservationLinkedList();

        // Add reservations (example pattern)
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("B");
        list.add("A");

        System.out.println("\nReservation Sequence:");
        list.display();

        if (list.isPalindrome()) {
            System.out.println("\nReservation pattern is symmetric (Palindrome)");
        } else {
            System.out.println("\nReservation pattern is NOT symmetric");
        }
    }
}