package com.warhammer.wfrpfrontend.controller;

import com.warhammer.wfrpfrontend.service.ProfessionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class ProfessionsController {
    
    private final ProfessionsService service;
    
    public List<String> getProfessionsNames() {
        return service.getProfessionsNamesList();
    }
    
    public String getClassName(String professionName) {
        return service.getProfessionClassByProfessionName(professionName);
    }
    
    public String getStatus(String professionName) {
        return service.getStatusByProfessionName(professionName);
    }
}
