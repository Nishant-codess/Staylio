import java.util.*;

/**
 * CLASS - RoomAllocationService
 *
 * Use Case 6: Reservation Confirmation & Room Allocation
 *
 * Ensures:
 * - Unique room IDs
 * - No double booking
 * - Inventory consistency
 */

public class RoomAllocationService {

    private Set<String> allocatedRoomIds;
    private Map<String, Set<String>> assignedRoomsByType;

    public RoomAllocationService() {
        allocatedRoomIds = new HashSet<>();
        assignedRoomsByType = new HashMap<>();
    }

    public void allocateRoom(Booking booking, RoomInventory inventory) {

        String roomType = booking.getRoomType();

        // Check availability
        if (!inventory.bookRoom(roomType)) {
            System.out.println("No rooms available for " + roomType);
            return;
        }

        // Generate unique room ID
        String roomId = generateRoomId(roomType);

        // Store globally
        allocatedRoomIds.add(roomId);

        // Store by type
        assignedRoomsByType
                .computeIfAbsent(roomType, k -> new HashSet<>())
                .add(roomId);

        System.out.println("Booking Confirmed!");
        System.out.println("Guest: " + booking.getGuestName());
        System.out.println("Room Type: " + roomType);
        System.out.println("Allocated Room ID: " + roomId);
    }

    private String generateRoomId(String roomType) {

        String roomId;

        do {
            roomId = roomType.substring(0, 2).toUpperCase()
                    + (int)(Math.random() * 1000);
        } while (allocatedRoomIds.contains(roomId));

        return roomId;
    }
}