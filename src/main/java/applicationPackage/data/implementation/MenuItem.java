package applicationPackage.data.implementation;

import applicationPackage.data.Interface.CostRelated;

public class MenuItem implements CostRelated {

    private int itemID;
    private String name;
    private String description;
    private double price;
    private MenuItem menuItemType;

    public MenuItem(int itemID, String name, String description, double price, MenuItem menuItemType) {
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

    public MenuItem getMenuItemType() {
        return menuItemType;
    }

    public void setMenuItemType(MenuItem menuItemType) {
        this.menuItemType = menuItemType;
    }

    @Override
    public void display() {
        System.out.println(this.itemID+" "+this.menuItemType.getName()+" | "+this.price);
    }

    @Override
    public void computeCost() {

    }
}
