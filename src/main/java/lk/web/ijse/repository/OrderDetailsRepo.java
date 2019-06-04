package lk.web.ijse.repository;

import lk.web.ijse.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepo extends JpaRepository<OrderDetail,Integer> {
}
