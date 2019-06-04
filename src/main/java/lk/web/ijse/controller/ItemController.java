package lk.web.ijse.controller;


import lk.web.ijse.dto.ItemDTO;
import lk.web.ijse.model.Item;
import lk.web.ijse.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping("/add")
    public String addItem(@RequestBody ItemDTO itemDTO) {
        return itemService.saveItem(itemDTO);
    }

    @PutMapping("/update")
    public String updateItem(@RequestBody ItemDTO itemDTO){
        return itemService.updateItem(itemDTO);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteItem(@PathVariable Integer id){
        return itemService.deleteItem(id);
    }

    @GetMapping(value="/findById/{id}")
    public Item searchItem(@PathVariable Integer id){
      return itemService.searchItem(id);
    }

    @GetMapping("/all")
    public List<ItemDTO> getAll(){
        return itemService.getAllItems();
    }



}
