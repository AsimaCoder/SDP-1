import java.util.ArrayList;
import java.util.List;

public class FurnitureInventory {
    private static FurnitureInventory instance;
    private List<FurnitureItem> inventory;

    private FurnitureInventory() {
        inventory = new ArrayList<>();
    }

    public static synchronized FurnitureInventory getInstance() {
        if (instance == null) {
            instance = new FurnitureInventory();
        }
        return instance;
    }

    public void addItem(FurnitureItem item) {
        inventory.add(item);
    }

    public void removeItem(FurnitureItem item) {
        inventory.remove(item);
    }

    public List<FurnitureItem> listItems() {
        return new ArrayList<>(inventory);
    }
}


