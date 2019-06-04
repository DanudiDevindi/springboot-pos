package lk.web.ijse.service;


import lk.web.ijse.dto.ItemDTO;
import lk.web.ijse.model.Item;

import java.util.List;

public interface ItemService {

    String saveItem(ItemDTO itemDTO) ;

    String updateItem(ItemDTO itemDTO);

    String deleteItem(Integer id);

    Item searchItem(Integer id);

    List<ItemDTO> getAllItems();
}
