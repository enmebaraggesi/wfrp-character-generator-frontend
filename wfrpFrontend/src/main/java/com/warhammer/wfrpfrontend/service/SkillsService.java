package com.warhammer.wfrpfrontend.service;

import com.warhammer.wfrpfrontend.client.WarhammerClient;
import com.warhammer.wfrpfrontend.dto.skill.SkillDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SkillsService {
    
    private final WarhammerClient client;
    
    public List<SkillDto> getAdvancedSkillsList() {
        return client.getAdvancedSkills();
    }
}
