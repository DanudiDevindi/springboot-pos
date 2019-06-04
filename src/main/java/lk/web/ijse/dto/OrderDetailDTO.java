package lk.web.ijse.dto;


public class OrderDetailDTO{

    private int odid;
    private int iid;
    private double unitPrice;
    private double qty;
    private double amount;

    public OrderDetailDTO(int odid,int iid, double qty,double unitPrice,double amount) {
        this.odid = odid;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.iid=iid;
        this.amount=amount;
    }
    public OrderDetailDTO(int odid, double qty,int iid) {
        this.odid = odid;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.iid=iid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getOdid() {
        return odid;
    }

    public void setOdid(int odid) {
        this.odid = odid;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }
}
