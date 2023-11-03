package com.warhammer.wfrpfrontend.controller;

import com.warhammer.wfrpfrontend.client.WarhammerClient;
import com.warhammer.wfrpfrontend.dto.ProfessionDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class ProfessionsController {
    
    private final WarhammerClient client;
    
    public List<String> getProfessionsNames() {
        List<ProfessionDto> professions = client.getProfessions();
        return professions.stream()
                          .map(ProfessionDto::name)
                          .sorted()
                          .toList();
    }
    
    public String getClassName(String professionName) {
        List<ProfessionDto> professions = client.getProfessions();
        List<String> list = professions.stream()
                                       .filter(professionDto -> professionDto.name().equals(professionName))
                                       .map(ProfessionDto::classField)
                                       .toList();
        return list.get(0);
    }
    
    public String getStatus(String professionName) {
        List<ProfessionDto> professions = client.getProfessions();
        List<String> list = professions.stream()
                                       .filter(professionDto -> professionDto.name().equals(professionName))
                                       .map(ProfessionDto::status)
                                       .toList();
        return list.get(0);
    }
}
