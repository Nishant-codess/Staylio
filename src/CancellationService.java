import java.util.*;

/**
 *
 * CLASS - CancellationService
 *
 * Use Case 10: Booking Cancellation & Inventory Rollback
 *
 * Description:
 * Handles booking cancellations and ensures:
 * - Inventory is restored correctly
 * - Rollback follows LIFO using Stack
 * - Invalid cancellations are prevented
 *
 * @author Nishant_Ranjan
 * @version 10.0
 */

public class CancellationService {

    // Stack to track rollback order (LIFO)
    private Stack<String> releasedRoomIds;

    // Map reservationId -> roomType
    private Map<String, String> reservationRoomMap;

    public CancellationService() {
        releasedRoomIds = new Stack<>();
        reservationRoomMap = new HashMap<>();
    }

    /**
     * Register a confirmed booking
     */
    public void registerBooking(String reservationId, String roomType) {
        reservationRoomMap.put(reservationId, roomType);
    }

    /**
     * Cancel booking and restore inventory
     */
    public void cancelBooking(String reservationId, RoomInventory inventory) {

        if (!reservationRoomMap.containsKey(reservationId)) {
            System.out.println("❌ Invalid cancellation. Booking not found.");
            return;
        }

        String roomType = reservationRoomMap.get(reservationId);

        // Restore inventory
        inventory.cancelRoom(roomType);

        // Track rollback
        releasedRoomIds.push(reservationId);

        // Remove booking
        reservationRoomMap.remove(reservationId);

        System.out.println("✅ Booking cancelled for ID: " + reservationId);
    }

    /**
     * Display rollback history
     */
    public void showRollbackHistory() {

        System.out.println("\nRollback History (Last Cancelled First):");

        if (releasedRoomIds.isEmpty()) {
            System.out.println("No cancellations yet.");
            return;
        }

        for (String id : releasedRoomIds) {
            System.out.println("Cancelled Booking ID: " + id);
        }
    }
}