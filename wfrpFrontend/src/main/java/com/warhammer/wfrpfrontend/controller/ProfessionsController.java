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
}
