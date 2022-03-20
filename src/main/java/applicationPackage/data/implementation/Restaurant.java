package applicationPackage.data.implementation;

import javax.persistence.*;
import java.util.ArrayList;


public class Restaurant {


    private ArrayList<Table> tables;
    private Menu menu;
    private ArrayList<Order> orders;
    private ArrayList<OrderInvoice> orderInvoices;
    private ArrayList<Staff> staffs;
    private ArrayList<Reservation> reservations;

    public Menu getMenu() {
        return menu;
    }




}
