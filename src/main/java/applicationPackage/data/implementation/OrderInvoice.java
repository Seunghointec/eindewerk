package applicationPackage.data.implementation;

import applicationPackage.data.Interface.CostRelated;
import org.aspectj.weaver.ast.Or;

import java.util.Date;
import java.util.Objects;

public class OrderInvoice implements CostRelated {

    private Date timeStamp;
    private double finalCost;
    private Order order;
    private Table table;
    private double serviceCharge;
    private double gsTax;
    private double memberDiscount;

    public OrderInvoice(Date timeStamp, Order order) {
        this.timeStamp = timeStamp;
        this.order = order;
    }

    public double getSERVICECHARGERATE() {
        return SERVICECHARGERATE;
    }

    public double getGSTAXCHARGE() {
        return GSTAXCHARGE;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public double getFinalCost() {
        return finalCost;
    }

    public void setFinalCost(double finalCost) {
        this.finalCost = finalCost;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public double getGsTax() {
        return gsTax;
    }

    public void setGsTax(double gsTax) {
        this.gsTax = gsTax;
    }

    public double getMemberDiscount() {
        return memberDiscount;
    }

    public void setMemberDiscount(double memberDiscount) {
        this.memberDiscount = memberDiscount;
    }

    @Override
    public String toString() {
        return "OrderInvoice{" +
                "SERVICECHARGERATE=" + SERVICECHARGERATE +
                ", GSTAXCHARGE=" + GSTAXCHARGE +
                ", timeStamp=" + timeStamp +
                ", finalCost=" + finalCost +
                ", order=" + order +
                ", table=" + table +
                ", serviceCharge=" + serviceCharge +
                ", gsTax=" + gsTax +
                ", memberDiscount=" + memberDiscount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderInvoice that = (OrderInvoice) o;
        return Double.compare(that.finalCost, finalCost) == 0 && Double.compare(that.serviceCharge, serviceCharge) == 0 && Double.compare(that.gsTax, gsTax) == 0 && Double.compare(that.memberDiscount, memberDiscount) == 0 && Objects.equals(timeStamp, that.timeStamp) && Objects.equals(order, that.order) && Objects.equals(table, that.table);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeStamp, finalCost, order, table, serviceCharge, gsTax, memberDiscount);
    }


    @Override
    public void display() {

    }

    @Override
    public void computeCost() {

    }
}
