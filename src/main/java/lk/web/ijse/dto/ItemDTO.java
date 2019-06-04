package lk.web.ijse.dto;

public class ItemDTO {
    private Integer itemCode;
    private String description;
    private Double unitPrice;
    private Integer qty;

    public ItemDTO() {
    }

    public ItemDTO(Integer itemCode, String description, Double unitPrice, Integer qty) {
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

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}
