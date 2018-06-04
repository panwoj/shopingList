package com.shoppinglist.mapper;

import com.shoppinglist.domain.Item;
import com.shoppinglist.domain.ItemDto;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {
    public Item mapToItem(final ItemDto itemDto) {
        return new Item(itemDto.getId(), itemDto.getName(), itemDto.getAmount());
    }

    public ItemDto mapToItemDto(final Item item) {
        return new ItemDto(item.getId(), item.getName(), item.getAmount());
    }
}
