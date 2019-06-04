package lk.web.ijse.controller;

import lk.web.ijse.dto.CustomerDTO;
import lk.web.ijse.dto.ItemDTO;
import lk.web.ijse.dto.OrderDTO;
import lk.web.ijse.dto.OrderDetailDTO;
import lk.web.ijse.model.Customer;
import lk.web.ijse.model.Item;
import lk.web.ijse.model.OrderDetail;
import lk.web.ijse.model.Orders;
import lk.web.ijse.service.CustomerService;
import lk.web.ijse.service.ItemService;
import lk.web.ijse.service.PlaceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "place")
public class PlaceOrderController {

    @Autowired
    private PlaceOrderService placeOrderService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ItemService itemService;

    Item item;
    Customer customer;

    @GetMapping("/find/{id}")
    public Customer searchCustomer(@PathVariable Integer id){

        customer= customerService.searchCustomer(id);
        return customer;

    }

    @GetMapping(value="/findById/{id}")
    public Item searchItem(@PathVariable Integer id){
        item= itemService.searchItem(id);
        System.out.println(item);
        return item;
    }


    @PostMapping("/add")
    public void addPlaceOrder(){
        //System.out.println(orders1.getCustomer());
        //System.out.println(orderDetail1.getOrders());
        Orders orders = new Orders();
       OrderDetail orderDetail=new OrderDetail();
//        item.setItemCode(8);
//        item.setDescription("Chicken");
//        item.setQty(10);
//        item.setUnitePrice(200.00);
//        customer.setId(1);
//        customer.setAddress("Moratuwa");
//        customer.setName("Jaye");
//        customer.setSalary(1000.00);
        orders.setOid(10);
        orders.setCustomer(customer);
        orders.setDate("2019-01-10");
        orderDetail.setOdid(11);
        orderDetail.setOrders(orders);
        orderDetail.setIid(item);
        orderDetail.setQty(2.0);
        orderDetail.setAmount(400.00);

        placeOrderService.addPlaceOrder(orders,orderDetail,customer,item);
        int x= (int) (item.getQty()-orderDetail.getQty());
        item.setQty(x);
        ItemDTO itemDTO=new ItemDTO(item.getItemCode(),item.getDescription(),item.getUnitePrice(),item.getQty());
        itemService.updateItem(itemDTO);


    }

}
