package com.warhammer.wfrpfrontend.dto.talent;

public record TalentDto(String name,
                        Integer maxValue,
                        String bonus,
                        String tested,
                        String description) {
    
}
