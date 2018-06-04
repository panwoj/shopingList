package com.shoppinglist.repository;

import com.shoppinglist.domain.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Long> {
    @Override
    Item save(Item item);

    @Override
    List<Item> findAll();
}
