package com.warhammer.wfrpfrontend.controller;

import com.warhammer.wfrpfrontend.service.ArmorsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class ArmorsController {
    
    private final ArmorsService service;
    
    public List<String> getArmorsNames() {
        return service.getArmorsNamesList();
    }
    
    public String getLocationByName(String name) {
        return service.getArmorLocationByName(name);
    }
    
    public String getWeightByName(String name) {
        return service.getArmorWeightByName(name);
    }
    
    public String getPenaltiesByName(String name) {
        return service.getArmorPenaltiesByName(name);
    }
    
    public Integer getPointsByName(String name) {
        return service.getArmorPointsByName(name);
    }
    
    public String getTraitsByName(String name) {
        return service.getArmorTraitsByName(name);
    }
}
