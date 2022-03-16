package applicationPackage.data.implementation;

import java.util.ArrayList;
import java.util.Date;

public class Order {

    private int OrderID;
    private Table table;
    private Staff creator;
    private ArrayList<OrderedItem> orderedItems;
    private ArrayList<OrderedSet> orderedSets;
    private double totalCost;
    private boolean completed;
    private Date timestamp;
    private String memberID;

    public Order(int orderID, Table table, Staff creator, ArrayList<OrderedItem> orderedItems,
                 ArrayList<OrderedSet> orderedSets, double totalCost, boolean completed, Date timestamp) {
        OrderID = orderID;
        this.table = table;
        this.creator = creator;
        this.orderedItems = orderedItems;
        this.orderedSets = orderedSets;
        this.totalCost = totalCost;
        this.completed = completed;
        this.timestamp = timestamp;
    }

    public Order(int orderID, Table table, Staff creator, ArrayList<OrderedItem> orderedItems,
                 ArrayList<OrderedSet> orderedSets, double totalCost, boolean completed, Date timestamp,
                 String memberID) {
        OrderID = orderID;
        this.table = table;
        this.creator = creator;
        this.orderedItems = orderedItems;
        this.orderedSets = orderedSets;
        this.totalCost = totalCost;
        this.completed = completed;
        this.timestamp = timestamp;
        this.memberID = memberID;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Staff getCreator() {
        return creator;
    }

    public void setCreator(Staff creator) {
        this.creator = creator;
    }

    public ArrayList<OrderedItem> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(ArrayList<OrderedItem> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public ArrayList<OrderedSet> getOrderedSets() {
        return orderedSets;
    }

    public void setOrderedSets(ArrayList<OrderedSet> orderedSets) {
        this.orderedSets = orderedSets;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }
}
