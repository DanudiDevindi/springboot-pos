package lk.web.ijse.model;

import javax.persistence.*;

@Entity
@Table(name = "OrderDetail")
public class OrderDetail {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "odid")
    private int odid;

    @ManyToOne
    @JoinColumn(name = "oid")
    private Orders orders;

    @ManyToOne
    @JoinColumn(name = "item_code")
    private Item iid;

    @Column(name = "qty")
    private double qty;

    @Column(name = "amount")
    private double amount;

    public OrderDetail(int odid, Orders orders, Item iid, double qty,double amount) {
        this.odid = odid;
        this.orders = orders;
        this.iid = iid;
        this.qty = qty;
        this.amount=amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public OrderDetail() {
    }

    public OrderDetail(int odid, double qty) {
        this.odid = odid;

        this.qty = qty;
    }

    public int getOdid() {
        return odid;
    }

    public void setOdid(int odid) {
        this.odid = odid;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Item getIid() {
        return iid;
    }

    public void setIid(Item iid) {
        this.iid = iid;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }
}
