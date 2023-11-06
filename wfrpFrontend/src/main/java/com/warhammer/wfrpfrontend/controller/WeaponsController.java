package com.warhammer.wfrpfrontend.controller;

import com.warhammer.wfrpfrontend.service.WeaponsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class WeaponsController {
    
    private final WeaponsService service;
    
    public List<String> getWeaponsNames() {
        return service.getWeaponsNameList();
    }
    
    public String getCategoryByName(String name) {
        return service.getCategoryByName(name);
    }
    
    public String getWeightByName(String name) {
        return service.getWeightByName(name);
    }
    
    public String getRangeByName(String name) {
        return service.getRangeByName(name);
    }
    
    
    public String getDamageByName(String name) {
        return service.getDamageByName(name);
    }
    
    public String getTraitsByName(String name) {
        return service.getTraitsByName(name);
    }
}
