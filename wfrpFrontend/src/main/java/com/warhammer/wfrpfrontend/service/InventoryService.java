package com.warhammer.wfrpfrontend.service;

import com.warhammer.wfrpfrontend.client.WarhammerClient;
import com.warhammer.wfrpfrontend.dto.inventory.HirelingDto;
import com.warhammer.wfrpfrontend.dto.inventory.InventoryDto;
import com.warhammer.wfrpfrontend.mapper.HirelingsMapper;
import com.warhammer.wfrpfrontend.mapper.InventoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {
    
    private final WarhammerClient client;
    private final InventoryMapper inventoryMapper;
    private final HirelingsMapper hirelingsMapper;
    
    
    public List<String> getInventoryNamesList() {
        List<InventoryDto> inventoryDtos = client.getInventory();
        return inventoryMapper.mapInventoryDtoListToNameList(inventoryDtos);
    }
    
    public String getInventoryWeightByName(String name) {
        List<InventoryDto> inventoryDtos = client.getInventory();
        return inventoryMapper.mapInventoryDtoListToWeight(inventoryDtos, name);
    }
    
    public List<String> getHirelingsNamesList() {
        List<HirelingDto> hirelings = client.getHirelings();
        return hirelingsMapper.mapHirelingDtoListToNameList(hirelings);
    }
    
    public String getHirelingCostByName(String name) {
        List<HirelingDto> hirelings = client.getHirelings();
        return hirelingsMapper.mapHirelingDtoListToCost(hirelings, name);
    }
}
