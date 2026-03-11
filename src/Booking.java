/**
 * CLASS - Booking
 *
 * Use Case 4: Room Booking System
 *
 * Description:
 * Represents a room booking made by a guest.
 *
 * @author Nishant_Ranjan
 * @version 4.0
 */

public class Booking {

    private String guestName;
    private String roomType;

    public Booking(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void displayBooking() {
        System.out.println("Guest: " + guestName + " | Room Type: " + roomType);
    }
}