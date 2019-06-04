package lk.web.ijse.dto;

import javafx.collections.ObservableList;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

public class OrderDTO implements Serializable {
    private int oid;
    private String orderDate;
    //private int cid;
    //private ObservableList<OrderDetailDTO> orderDetailDTOS;


    public OrderDTO() {
    }

    public OrderDTO(int oid, String orderDate) {
        this.oid = oid;
        this.orderDate = orderDate;
    }

//    public OrderDTO(int oid, String orderDate, int cid, ObservableList<OrderDetailDTO> od) {
//        this.oid = oid;
//        this.orderDate = orderDate;
//        this.cid = cid;
//        this.orderDetailDTOS=od;
//    }
a//    public OrderDTO(int oid, String orderDate, int cid) {
//        this.oid = oid;
//        this.orderDate = orderDate;
//        this.cid = cid;
//    }
//
//    public OrderDTO(int oid, String orderDate, int cid, ArrayList<OrderDetailDTO> orderDetailDTOS) {
//        this.oid = oid;
//        this.orderDate = orderDate;
//        this.cid = cid;
//
//    }

//    public ObservableList<OrderDetailDTO> getOrderDetailDTOS() {
//        return orderDetailDTOS;
//    }

    public int getOid() {
        return oid;
    }

    public String getOrderDate() {
        return orderDate;
    }

//    public int getCid() {
//        return cid;
//    }
}
