package applicationPackage.data.implementation;

import java.util.ArrayList;

public class PromoSet {

    private int promoID;
    private String name;
    private ArrayList<MenuItem> promotionItems;
    private String description;
    private double price;

    public PromoSet(int promoID, String name, ArrayList<MenuItem> promotionItems, String description, double price) {
        this.promoID = promoID;
        this.name = name;
        this.promotionItems = promotionItems;
        this.description = description;
        this.price = price;
    }

    public int getPromoID() {
        return promoID;
    }

    public void setPromoID(int promoID) {
        this.promoID = promoID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<MenuItem> getPromotionItems() {
        return promotionItems;
    }

    public void setPromotionItems(ArrayList<MenuItem> promotionItems) {
        this.promotionItems = promotionItems;
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
}
