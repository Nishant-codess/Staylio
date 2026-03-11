/**
 * MAIN CLASS - HotelBookingApp
 *
 * Staylio Booking Platform
 *
 * Use Case 3: Centralized Room Inventory
 *
 * @author Nishant_Ranjan
 * @version 3.0
 */

public class HotelBookingApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("          Staylio Platform       ");
        System.out.println("     Smart Hotel Booking System  ");
        System.out.println("           Version 3.0           ");
        System.out.println("=================================");

        // Create room objects
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Create inventory manager
        RoomInventory inventory = new RoomInventory();

        System.out.println("\nRoom Types Available\n");

        System.out.println("Single Room");
        singleRoom.displayRoomDetails();

        System.out.println("Double Room");
        doubleRoom.displayRoomDetails();

        System.out.println("Suite Room");
        suiteRoom.displayRoomDetails();

        // Display centralized inventory
        inventory.displayInventory();
    }
}