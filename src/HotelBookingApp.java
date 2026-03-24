import java.util.*;

/**
 * MAIN CLASS - HotelBookingApp
 *
 * Staylio Platform
 *
 * Use Case 7: Add-On Services
 */

public class HotelBookingApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("          Staylio Platform       ");
        System.out.println("     Smart Hotel Booking System  ");
        System.out.println("           Version 7.0           ");
        System.out.println("=================================");

        // Assume reservation already confirmed (UC6)
        String reservationId = "RES101";

        AddOnServiceManager serviceManager = new AddOnServiceManager();

        // Add services
        serviceManager.addService(reservationId, new AddOnService("Breakfast", 500));
        serviceManager.addService(reservationId, new AddOnService("Spa", 1200));
        serviceManager.addService(reservationId, new AddOnService("Airport Pickup", 800));

        // Display services
        serviceManager.displayServices(reservationId);

        // Total cost
        double totalCost = serviceManager.calculateTotalServiceCost(reservationId);

        System.out.println("\nTotal Add-On Cost: ₹" + totalCost);
    }
}w