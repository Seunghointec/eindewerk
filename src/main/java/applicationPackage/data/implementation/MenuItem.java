package applicationPackage.data.implementation;

import applicationPackage.data.Interface.CostRelated;

public class MenuItem implements CostRelated {

    private int itemID;
    private String name;
    private String description;
    private double price;
    private MenuType menuItemType;

    public MenuItem(int itemID, String name, String description, double price, MenuType menuItemType) {
        this.itemID = itemID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.menuItemType = menuItemType;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MenuType getMenuItemType() {
        return menuItemType;
    }

    public void setMenuItemType(MenuType menuItemType) {
        this.menuItemType = menuItemType;
    }

    @Override
    public void display() {
        System.out.println(this.itemID+" "+getMenuItemType()+" | "+this.price + " "
                + this.description + " " + this.name);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "itemID=" + itemID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", menuItemType=" + menuItemType +
                '}';
    }

    @Override
    public void computeCost() {

    }
}
