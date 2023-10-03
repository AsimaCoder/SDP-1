import java.util.List;

public class OfficeFurnitureApp {
    public static void main(String[] args) {
        OfficeFurnitureManager manager = new OfficeFurnitureManager();

        FurnitureItem chair = new FurnitureItem("Office Chair", "Ergonomic chair", 150.0);
        FurnitureItem desk = new FurnitureItem("Office Desk", "Large wooden desk", 250.0);
        manager.addFurnitureItem(chair);
        manager.addFurnitureItem(desk);

        List<FurnitureItem> items = manager.listAvailableFurniture();
        System.out.println("Available Furniture Items:");
        for (FurnitureItem item : items) {
            System.out.println("Name: " + item.getName());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Base Price: $" + item.getBasePrice());
            System.out.println();
        }
    }
}

