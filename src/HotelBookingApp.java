import java.util.*;

/**
 * MAIN CLASS - HotelBookingApp
 *
 * Staylio Booking Platform
 *
 * Use Case 6: Room Allocation System
 */

public class HotelBookingApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("          Staylio Platform       ");
        System.out.println("     Smart Hotel Booking System  ");
        System.out.println("           Version 6.0           ");
        System.out.println("=================================");

        RoomInventory inventory = new RoomInventory();
        RoomAllocationService allocator = new RoomAllocationService();

        Queue<Booking> bookingQueue = new LinkedList<>();

        // Add booking requests (FIFO)
        bookingQueue.add(new Booking("Nishant", "Single"));
        bookingQueue.add(new Booking("Arjun", "Double"));
        bookingQueue.add(new Booking("Ram", "Suite"));

        inventory.displayInventory();

        System.out.println("\nProcessing Booking Requests...\n");

        while (!bookingQueue.isEmpty()) {

            Booking booking = bookingQueue.poll(); // FIFO

            allocator.allocateRoom(booking, inventory);

            System.out.println("---------------------------");
        }

        inventory.displayInventory();
    }
}