package com.shoppinglist.mapper;

import com.shoppinglist.domain.Item;
import com.shoppinglist.domain.ItemDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ItemMapper {
    public Item mapToItem(final ItemDto itemDto) {
        return new Item(itemDto.getId(), itemDto.getName(), itemDto.getAmount());
    }

    public List<ItemDto> mapToItemDtoList(final List<Item> itemList) {
        return itemList.stream()
                .map(i -> new ItemDto(i.getId(), i.getName(), i.getAmount()))
                .collect(Collectors.toList());
    }
}
