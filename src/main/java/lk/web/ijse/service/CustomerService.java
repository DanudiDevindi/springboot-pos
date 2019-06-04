package lk.web.ijse.service;

import lk.web.ijse.dto.CustomerDTO;
import lk.web.ijse.model.Customer;

import java.util.List;

public interface CustomerService {


    List<CustomerDTO> getAllCustomers();

    void addCustomer(CustomerDTO customer);

    void updateCustomer(CustomerDTO customerDTO);

    Customer searchCustomer(Integer id);

    void deleteCustomer(Integer id);



    Long getTotalCustomer();
}
