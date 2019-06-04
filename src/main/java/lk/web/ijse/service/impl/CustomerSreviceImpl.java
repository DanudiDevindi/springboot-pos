package lk.web.ijse.service.impl;

import lk.web.ijse.dto.CustomerDTO;
import lk.web.ijse.model.Customer;
import lk.web.ijse.repository.CustomerRepo;
import lk.web.ijse.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerSreviceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;


    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<CustomerDTO> list=new ArrayList<>();
       List<Customer> allCus= customerRepo.findAll();
       for (Customer c : allCus){
           list.add(new CustomerDTO(c.getId(),c.getName(),c.getAddress(),c.getSalary()));

       }
       return list;

    }

    @Override
    public void addCustomer(CustomerDTO customer) {

       Customer customer1= new Customer(customer.getId(),customer.getName(),customer.getAddress(),customer.getSalary());
       customerRepo.save(customer1);
    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {
        String msg=null;
        Customer customer=new Customer(customerDTO.getId(),customerDTO.getName(),customerDTO.getAddress(),
                customerDTO.getSalary());
       if(customer.getId()!=null){
           customerRepo.save(customer);
           System.out.println("Updated");
       }else{
           System.out.println("Error");
       }

    }

    @Override
    public Customer searchCustomer(Integer id) {
        Optional<Customer> cus = this.customerRepo.findById(id);
        if (cus.isPresent()) {
            return cus.get();
        } else {
            return null;
        }
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerRepo.deleteById(id);
    }

  @Override
    public Long getTotalCustomer() {
        return customerRepo.getTotalCustomers();

    }
}
