package lk.web.ijse.service;

import lk.web.ijse.dto.OrderDTO;
import lk.web.ijse.dto.OrderDetailDTO;
import lk.web.ijse.model.Customer;
import lk.web.ijse.model.Item;
import lk.web.ijse.model.OrderDetail;
import lk.web.ijse.model.Orders;

public interface PlaceOrderService {



    void addPlaceOrder(Orders orders, OrderDetail orderDetail, Customer customer, Item item);
}
