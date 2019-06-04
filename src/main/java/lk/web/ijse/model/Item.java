package lk.web.ijse.model;


import javax.naming.Name;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ItemCode")
    private Integer itemCode;
    @Column(name = "ItemDescription")
    private String description;
    @Column(name = "unitPrice")
    private Double unitPrice;
    @Column(name = "Quantity")
    private Integer qty;

//    @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
//    private List<OrderDetails> orderDetails = new ArrayList<>();// uses a list as many orders for one customer

    public Item() {

    }

    public Item(Integer itemCode, String description, Double unitPrice, Integer qty) {
        this.itemCode = itemCode;
        this.description = description;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }

    public Integer getItemCode() {
        return itemCode;
    }

    public void setItemCode(Integer itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getUnitePrice() {
        return unitPrice;
    }

    public void setUnitePrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

//    public List<OrderDetails> getOrderDetails() {
//        return orderDetails;
//    }
//
//    public void setOrderDetails(List<OrderDetails> orderDetails) {
//        this.orderDetails = orderDetails;
//    }

    @Override
    public String toString() {
        return "Item{" +
                "itemCode=" + itemCode +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                ", qty=" + qty +
                '}';
    }
}
