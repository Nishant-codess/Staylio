import java.util.HashMap;

/**
 * CLASS - RoomInventory
 *
 * Use Case 3: Centralized Room Inventory
 *
 * Description:
 * This class manages the availability of different
 * room types using a HashMap.
 *
 * Key Concepts:
 * - HashMap data structure
 * - Encapsulation
 * - Inventory management
 *
 * @author Nishant_Ranjan
 * @version 3.0
 */

public class RoomInventory {

    private HashMap<String, Integer> inventory;

    public RoomInventory() {

        inventory = new HashMap<>();

        inventory.put("Single", 5);
        inventory.put("Double", 3);
        inventory.put("Suite", 2);
    }

    public int getAvailableRooms(String roomType) {

        return inventory.getOrDefault(roomType, 0);
    }

    public void displayInventory() {

        System.out.println("\nRoom Inventory");

        for (String roomType : inventory.keySet()) {

            System.out.println(roomType + " Rooms Available: " + inventory.get(roomType));
        }

        System.out.println("-------------------------------");
    }
}