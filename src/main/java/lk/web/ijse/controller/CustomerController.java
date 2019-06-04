package lk.web.ijse.controller;

import lk.web.ijse.dto.CustomerDTO;
import lk.web.ijse.model.Customer;
import lk.web.ijse.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/add")
    public void addCustomer(@RequestBody CustomerDTO customer){
         customerService.addCustomer(customer);
    }

    @GetMapping("/all")
    public List<CustomerDTO> getAll(){
        return customerService.getAllCustomers();
    }

    @PutMapping("/update")
    public void updateCustomer(@RequestBody CustomerDTO customerDTO){

         customerService.updateCustomer(customerDTO);
    }

    @GetMapping("/find/{id}")
    public Customer searchCustomer(@PathVariable Integer id){

        return customerService.searchCustomer(id);

    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        customerService.deleteCustomer(id);
    }

   @GetMapping("value")
    public Long getCustomerCount(){
        return customerService.getTotalCustomer();
    }

}
