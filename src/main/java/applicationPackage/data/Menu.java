package applicationPackage.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu {
    @Id
    @Column(name = "itemId", nullable = false)
    private Long itemID;

    private String name;
    private String description;
    private double price;
    private MenuType menuType;

    public Menu(Long itemID, String name, String description, double price, MenuType menuType) {
        this.itemID = itemID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.menuType = menuType;
    }

    public Long getId() {
        return itemID;
    }

    public void setId(Long id) {
        this.itemID = id;
    }

    public Long getItemID() {
        return itemID;
    }

    public void setItemID(Long itemID) {
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

    public MenuType getMenuType() {
        return menuType;
    }

    public void setMenuType(MenuType menuType) {
        this.menuType = menuType;
    }
}
