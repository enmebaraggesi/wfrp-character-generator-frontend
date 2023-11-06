package com.warhammer.wfrpfrontend.controller;

import com.warhammer.wfrpfrontend.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class InventoryController {
    
    private final InventoryService service;
    
    public List<String> getInventoryNames() {
        return service.getInventoryNamesList();
    }
    
    public String getInventoryWeightByName(String name) {
        return service.getInventoryWeightByName(name);
    }
    
    public List<String> getHirelingsNames() {
        return service.getHirelingsNamesList();
    }
    
    public String getHirelingCostByName(String name) {
        return service.getHirelingCostByName(name);
    }
}
