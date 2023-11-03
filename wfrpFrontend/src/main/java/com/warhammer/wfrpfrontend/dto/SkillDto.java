package com.warhammer.wfrpfrontend.dto;

public record SkillDto(String name,
                       String attribute,
                       Boolean isAdvanced,
                       Boolean isGroup,
                       String description) {
    
}
