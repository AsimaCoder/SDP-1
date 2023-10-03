public class FurnitureItem {
    private String name;
    private String description;
    private double basePrice;

    public FurnitureItem(String name, String description, double basePrice) {
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return "FurnitureItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}
