/**
 *
 * CLASS - ReservationValidator
 *
 * Use Case 9: Error Handling & Validation
 *
 * Description:
 * Validates booking input using RoomInventory logic.
 *
 * @author Nishant_Ranjan
 * @version 9.0
 */

public class ReservationValidator {

    public void validate(String guestName,
                         String roomType,
                         RoomInventory inventory)
            throws InvalidBookingException {

        // Validate guest name
        if (guestName == null || guestName.trim().isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty");
        }

        // Validate room type
        if (!roomType.equals("Single") &&
                !roomType.equals("Double") &&
                !roomType.equals("Suite")) {

            throw new InvalidBookingException("Invalid room type selected");
        }

        // 🔥 TRY BOOKING (CHECK + UPDATE)
        boolean booked = inventory.bookRoom(roomType);

        if (!booked) {
            throw new InvalidBookingException("Room not available");
        }

        // NOTE:
        // Booking already reduces inventory here
    }
}