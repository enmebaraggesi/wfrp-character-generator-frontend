package com.warhammer.wfrpfrontend.dto.armor;

public record ArmorDto(String type,
                       String name,
                       String weight,
                       String penalty,
                       String localization,
                       Integer points,
                       String traits) {
    
}
