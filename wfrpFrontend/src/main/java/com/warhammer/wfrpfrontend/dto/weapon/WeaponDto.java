package com.warhammer.wfrpfrontend.dto.weapon;

public record WeaponDto(String type,
                        String name,
                        String cost,
                        String weight,
                        String availability,
                        String length,
                        String damage,
                        String traits) {
    
}
