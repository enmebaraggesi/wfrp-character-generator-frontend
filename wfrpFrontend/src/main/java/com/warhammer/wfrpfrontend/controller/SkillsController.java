package com.warhammer.wfrpfrontend.controller;

import com.warhammer.wfrpfrontend.client.WarhammerClient;
import com.warhammer.wfrpfrontend.dto.SkillDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class SkillsController {
    
    private final WarhammerClient client;
    
    public List<String> getAdvancedSkillsNames() {
        List<SkillDto> advancedSkills = client.getAdvancedSkills();
        return advancedSkills.stream()
                             .map(SkillDto::name)
                             .collect(Collectors.toList());
    }
    
    public List<SkillDto> getAdvancedSkills() {
        return client.getAdvancedSkills();
    }
}
