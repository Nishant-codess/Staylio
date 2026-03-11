/**
 * MAIN CLASS - HotelBookingApp
 *
 * Staylio Booking Platform
 *
 * Use Case 2: Basic Room Types & Static Availability
 */

public class HotelBookingApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("        Staylio Platform         ");
        System.out.println("   Smart Hotel Booking System    ");
        System.out.println("          Version 2.0            ");
        System.out.println("=================================");

        // Create room objects
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Static availability variables
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("\nAvailable Rooms\n");

        System.out.println("Single Room (Available: " + singleAvailable + ")");
        singleRoom.displayRoomDetails();

        System.out.println("Double Room (Available: " + doubleAvailable + ")");
        doubleRoom.displayRoomDetails();

        System.out.println("Suite Room (Available: " + suiteAvailable + ")");
        suiteRoom.displayRoomDetails();

    }
}