import java.util.ArrayList;

/**
 * MAIN CLASS - HotelBookingApp
 *
 * Staylio Booking Platform
 *
 * Use Case 4: Room Booking
 */

public class HotelBookingApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("          Staylio Platform       ");
        System.out.println("     Smart Hotel Booking System  ");
        System.out.println("           Version 4.0           ");
        System.out.println("=================================");

        RoomInventory inventory = new RoomInventory();

        ArrayList<Booking> bookings = new ArrayList<>();

        inventory.displayInventory();

        System.out.println("\nBooking Room...");

        String guest = "Nishant";
        String roomType = "Single";

        if (inventory.bookRoom(roomType)) {

            Booking booking = new Booking(guest, roomType);
            bookings.add(booking);

            System.out.println("Booking Successful!");
            booking.displayBooking();
        } else {

            System.out.println("Room not available.");
        }

        inventory.displayInventory();
    }
}