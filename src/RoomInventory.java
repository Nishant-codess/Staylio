import java.util.HashMap;

/**
 * CLASS - RoomInventory
 *
 * Use Case 4: Inventory + Booking Update
 */

public class RoomInventory {

    private HashMap<String, Integer> inventory;

    public RoomInventory() {

        inventory = new HashMap<>();

        inventory.put("Single", 5);
        inventory.put("Double", 3);
        inventory.put("Suite", 2);
    }

    public boolean bookRoom(String roomType) {

        int available = inventory.getOrDefault(roomType, 0);

        if (available > 0) {

            inventory.put(roomType, available - 1);
            return true;
        }

        return false;
    }

    public void cancelRoom(String roomType) {

        int available = inventory.getOrDefault(roomType, 0);
        inventory.put(roomType, available + 1);
    }

    public void displayInventory() {

        System.out.println("\nRoom Inventory");

        for (String roomType : inventory.keySet()) {

            System.out.println(roomType + " Rooms Available: " + inventory.get(roomType));
        }

        System.out.println("-------------------------------");
    }
}