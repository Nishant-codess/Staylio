/**
 *
 * MAIN CLASS - HotelBookingApp
 *
 * Use Case 10: Booking Cancellation & Inventory Rollback
 *
 * Description:
 * Demonstrates cancellation of bookings
 * and restoring inventory using Stack (LIFO).
 *
 * @author Nishant_Ranjan
 * @version 10.0
 */

public class HotelBookingApp {

    public static void main(String[] args) {

        System.out.println("=== Staylio - Booking Cancellation System ===");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Initialize cancellation service
        CancellationService cancellationService = new CancellationService();

        // Simulate confirmed bookings
        cancellationService.registerBooking("B101", "Single");
        cancellationService.registerBooking("B102", "Double");
        cancellationService.registerBooking("B103", "Suite");

        System.out.println("\nBefore Cancellation:");
        inventory.displayInventory();

        // Cancel bookings
        cancellationService.cancelBooking("B102", inventory);
        cancellationService.cancelBooking("B101", inventory);

        System.out.println("\nAfter Cancellation:");
        inventory.displayInventory();

        // Show rollback history
        cancellationService.showRollbackHistory();
    }
}