package lk.web.ijse.repository;

import lk.web.ijse.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Orders,Integer>{
}
