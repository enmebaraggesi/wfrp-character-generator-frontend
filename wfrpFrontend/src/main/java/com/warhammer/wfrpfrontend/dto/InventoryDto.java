package com.warhammer.wfrpfrontend.dto;

public record InventoryDto(String type,
                           String name,
                           String cost,
                           String weight,
                           Integer contains,
                           String availability) {
    
}
