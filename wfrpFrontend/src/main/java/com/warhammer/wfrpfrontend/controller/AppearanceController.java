package com.warhammer.wfrpfrontend.controller;

import com.warhammer.wfrpfrontend.service.AppearanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class AppearanceController {
    
    private final AppearanceService service;
    
    public List<String> getRaces() {
        return service.getRacesNamesList();
    }
    
    public List<String> getEyeColors(String race) {
        return service.getEyeColorsListByRace(race);
    }
    
    public List<String> getHairColors(String race) {
        return service.getHairColorsListByRace(race);
    }
    
    public String getGeneratedAge(String race) {
        return service.getGeneratedAgeByRace(race);
    }
    
    public String getGeneratedHeight(String race) {
        return service.getGeneratedHeightByRace(race);
    }
}
