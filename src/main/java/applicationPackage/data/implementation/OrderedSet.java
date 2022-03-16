package applicationPackage.data.implementation;

public class OrderedSet {

    private int quantity;
    private PromoSet promotionSet;
    private double cost;

    public OrderedSet(int quantity, PromoSet promotionSet, double cost) {
        this.quantity = quantity;
        this.promotionSet = promotionSet;
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public PromoSet getPromotionSet() {
        return promotionSet;
    }

    public void setPromotionSet(PromoSet promotionSet) {
        this.promotionSet = promotionSet;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
