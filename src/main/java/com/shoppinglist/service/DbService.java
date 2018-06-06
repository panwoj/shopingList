package com.shoppinglist.service;

import com.shoppinglist.domain.Item;
import com.shoppinglist.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {
    @Autowired
    private ItemRepository itemRepository;

    public Item saveItem(final Item item) {
        return itemRepository.save(item);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public void deleteById(Long id) {
        itemRepository.deleteById(id);
    }
}
