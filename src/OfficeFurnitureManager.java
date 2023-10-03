import java.util.List;

public class OfficeFurnitureManager {
    private FurnitureInventory inventory;

    public OfficeFurnitureManager() {
        inventory = FurnitureInventory.getInstance();
    }

    public void addFurnitureItem(FurnitureItem item) {
        inventory.addItem(item);
    }

    public void removeFurnitureItem(FurnitureItem item) {
        inventory.removeItem(item);
    }

    public List<FurnitureItem> listAvailableFurniture() {
        return inventory.listItems();
    }
}

