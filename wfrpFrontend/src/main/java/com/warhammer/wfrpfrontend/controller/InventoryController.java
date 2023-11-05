package com.warhammer.wfrpfrontend.controller;

import com.warhammer.wfrpfrontend.client.WarhammerClient;
import com.warhammer.wfrpfrontend.dto.HirelingDto;
import com.warhammer.wfrpfrontend.dto.InventoryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class InventoryController {
    
    private final WarhammerClient client;
    
    public List<String> getInventoryNames() {
        List<InventoryDto> inventoryDtos = client.getInventory();
        return inventoryDtos.stream()
                            .map(InventoryDto::name)
                            .toList();
    }
    
    public String getInventoryWeightByName(String name) {
        List<InventoryDto> inventoryDtos = client.getInventory();
        return inventoryDtos.stream()
                            .filter(dto -> dto.name().equals(name))
                            .map(InventoryDto::weight)
                            .collect(toSingleton());
    }
    
    public List<String> getHirelingsNames() {
        List<HirelingDto> hirelings = client.getHirelings();
        return hirelings.stream()
                        .map(HirelingDto::name)
                        .toList();
    }
    
    public String getHirelingCostByName(String name) {
        List<HirelingDto> hirelings = client.getHirelings();
        return hirelings.stream()
                        .filter(dto -> dto.name().equals(name))
                        .map(dto -> "Sz: " + dto.quickJob() + ", D: " + dto.dayJob() + ", T: " + dto.weekJob())
                        .collect(toSingleton());
    }
    
    public <T> Collector<T, ?, T> toSingleton() {
        return Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                    if (list.size() != 1) {
                        throw new IllegalStateException();
                    }
                    return list.get(0);
                }
        );
    }
}
