package com.warhammer.wfrpfrontend.mapper;

import com.warhammer.wfrpfrontend.dto.inventory.InventoryDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryMapper {
    
    public List<String> mapInventoryDtoListToNameList(List<InventoryDto> inventoryDtos) {
        return inventoryDtos.stream()
                            .map(InventoryDto::name)
                            .toList();
    }
    
    public String mapInventoryDtoListToWeight(List<InventoryDto> inventoryDtos, String name) {
        return inventoryDtos.stream()
                            .filter(dto -> dto.name().equals(name))
                            .map(InventoryDto::weight)
                            .findFirst().orElseThrow(IllegalStateException::new);
    }
}
