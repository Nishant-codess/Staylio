import java.util.ArrayList;

/**
 * MAIN CLASS - HotelBookingApp
 *
 * Staylio Booking Platform
 *
 * Use Case 5: Booking Cancellation
 */

public class HotelBookingApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("          Staylio Platform       ");
        System.out.println("     Smart Hotel Booking System  ");
        System.out.println("           Version 5.0           ");
        System.out.println("=================================");

        RoomInventory inventory = new RoomInventory();
        ArrayList<Booking> bookings = new ArrayList<>();

        inventory.displayInventory();

        System.out.println("\nCreating Booking...");

        Booking booking1 = new Booking("Nishant", "Single");

        if (inventory.bookRoom(booking1.getRoomType())) {

            bookings.add(booking1);
            System.out.println("Booking successful:");
            booking1.displayBooking();
        }

        inventory.displayInventory();

        System.out.println("\nCancelling Booking...");

        if (!bookings.isEmpty()) {

            Booking cancelBooking = bookings.get(0);

            inventory.cancelRoom(cancelBooking.getRoomType());

            bookings.remove(cancelBooking);

            System.out.println("Booking cancelled for " + cancelBooking.getGuestName());
        }

        inventory.displayInventory();
    }
}