package com.warhammer.wfrpfrontend.controller;

import com.warhammer.wfrpfrontend.dto.skill.SkillDto;
import com.warhammer.wfrpfrontend.service.SkillsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class SkillsController {
    
    private final SkillsService service;
    
    public List<SkillDto> getAdvancedSkills() {
        return service.getAdvancedSkillsList();
    }
}
