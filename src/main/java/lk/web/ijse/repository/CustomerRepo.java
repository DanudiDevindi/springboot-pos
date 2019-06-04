package lk.web.ijse.repository;

import lk.web.ijse.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepo extends JpaRepository< Customer , Integer > {

    @Query("SELECT count(c.id) FROM Customer c")
    Long getTotalCustomers();


}
