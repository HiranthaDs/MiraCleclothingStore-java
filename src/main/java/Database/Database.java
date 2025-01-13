package miracleclothingstore;

import java.util.ArrayList;

public class Database {

    // Placeholder class for database operations (e.g., fetching items, managing orders)
    private static ArrayList<Item> items = new ArrayList<>();

    public static ArrayList<Item> getItems() {
        // Return a list of items (fake data for now)
        if (items.isEmpty()) {
            items.add(new Item("T-shirt", 19.99));
            items.add(new Item("Jeans", 39.99));
            items.add(new Item("Jacket", 59.99));
        }
        return items;
    }

    public static void addItem(Item item) {
        items.add(item);
    }

    public static void removeItem(Item item) {
        items.remove(item);
    }
}
