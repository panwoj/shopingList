package com.shoppinglist.controller;

import com.shoppinglist.domain.Item;
import com.shoppinglist.domain.ItemDto;
import com.shoppinglist.mapper.ItemMapper;
import com.shoppinglist.service.DbService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class ItemController {
    private DbService dbService;
    private ItemMapper itemMapper;

    @RequestMapping(method = RequestMethod.GET, value = "/items")
    public List<ItemDto> getItems() {
        return itemMapper.mapToItemDtoList(dbService.getAllItems());
    }

    @RequestMapping(method = RequestMethod.POST, value = "/items", consumes = APPLICATION_JSON_VALUE)
    public Item addItem(@RequestBody ItemDto itemDto) {
        return dbService.saveItem(itemMapper.mapToItem(itemDto));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/items/{itemId}")
    public void deleteItem(@PathVariable Long taskId) {
        dbService.deleteById(taskId);
    }

}
