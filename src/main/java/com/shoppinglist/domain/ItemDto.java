package com.shoppinglist.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ItemDto {
    private Long id;
    private String name;
    private int amount;
}
