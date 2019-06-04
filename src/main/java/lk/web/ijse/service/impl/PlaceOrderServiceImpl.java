package lk.web.ijse.service.impl;

import lk.web.ijse.dto.OrderDTO;
import lk.web.ijse.dto.OrderDetailDTO;
import lk.web.ijse.model.Customer;
import lk.web.ijse.model.Item;
import lk.web.ijse.model.OrderDetail;
import lk.web.ijse.model.Orders;
import lk.web.ijse.repository.ItemRepo;
import lk.web.ijse.repository.OrderDetailsRepo;
import lk.web.ijse.repository.OrderRepo;
import lk.web.ijse.service.PlaceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlaceOrderServiceImpl implements PlaceOrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private OrderDetailsRepo orderDetailsRepo;

    @Autowired
    private ItemRepo itemRepo;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addPlaceOrder(Orders orders, OrderDetail orderDetail, Customer customer, Item item) {
        Orders orders1=new Orders(orders.getOid(),customer,orders.getDate());
        OrderDetail orderDetail1=new OrderDetail(orderDetail.getOdid(),orders1,item,orderDetail.getQty(),orderDetail.getAmount());
        System.out.println(orders1.getDate());

        orderRepo.save(orders1);
        orderDetailsRepo.save(orderDetail1);

    }
}
