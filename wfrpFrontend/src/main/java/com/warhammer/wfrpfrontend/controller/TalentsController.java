package com.warhammer.wfrpfrontend.controller;

import com.warhammer.wfrpfrontend.client.WarhammerClient;
import com.warhammer.wfrpfrontend.dto.TalentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class TalentsController {
    
    private final WarhammerClient client;
    
    public List<String> getTalentsNames() {
        List<TalentDto> talents = client.getTalents();
        return talents.stream()
                      .map(TalentDto::name)
                      .toList();
    }
}
