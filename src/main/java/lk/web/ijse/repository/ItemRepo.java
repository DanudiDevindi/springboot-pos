package lk.web.ijse.repository;


import lk.web.ijse.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item,Integer> {
}
