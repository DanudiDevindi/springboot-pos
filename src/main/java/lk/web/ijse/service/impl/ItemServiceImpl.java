package lk.web.ijse.service.impl;


import lk.web.ijse.dto.ItemDTO;
import lk.web.ijse.model.Item;
import lk.web.ijse.repository.ItemRepo;
import lk.web.ijse.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepo itemRepo;

    @Override
    public String deleteItem(Integer id) {
        String msg=null;
        itemRepo.deleteById(id);
        return msg="Deleted";
    }

    @Override
    public Item searchItem(Integer id) {
        Optional<Item> itemEntity=itemRepo.findById(id);
        if(itemEntity.isPresent()){
           return itemEntity.get();
        }
        return null;
    }

    @Override
    public List<ItemDTO> getAllItems() {
        List<ItemDTO> list=new ArrayList<>();
        List<Item> allCus= itemRepo.findAll();
        for (Item c : allCus){
            list.add(new ItemDTO(c.getItemCode(),c.getDescription(),c.getUnitePrice(),c.getQty()));

        }
        return list;
    }

    @Override
    public String updateItem(ItemDTO itemDTO) {
        Item item =new Item(itemDTO.getItemCode(), itemDTO.getDescription(), itemDTO.getUnitPrice(), itemDTO.getQty());
        String msg=null;
        if(item.getItemCode()!=null){
              itemRepo.save(item);
              return msg="Update Success";
        }
        return msg="not update";
    }

    @Override
    public String saveItem(ItemDTO itemDTO) {
        Item item =new Item(itemDTO.getItemCode(), itemDTO.getDescription(), itemDTO.getUnitPrice(), itemDTO.getQty());
        itemRepo.save(item);
        return "Data Saved";
    }
}
