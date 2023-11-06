package com.warhammer.wfrpfrontend.mapper;

import com.warhammer.wfrpfrontend.dto.profession.ProfessionDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeofessionsMapper {
    
    public List<String> mapProfessionDtoListToNamesList(List<ProfessionDto> professions) {
        return professions.stream()
                          .map(ProfessionDto::name)
                          .sorted()
                          .toList();
    }
    
    public String mapProfessionDtoToClass(List<ProfessionDto> professions, String professionName) {
        return professions.stream()
                          .filter(professionDto -> professionDto.name().equals(professionName))
                          .map(ProfessionDto::classField)
                          .findAny().orElseThrow(IllegalStateException::new);
    }
    
    public String mapProfessionDtoToStatus(List<ProfessionDto> professions, String professionName) {
        return professions.stream()
                          .filter(professionDto -> professionDto.name().equals(professionName))
                          .map(ProfessionDto::status)
                          .findAny().orElseThrow(IllegalStateException::new);
    }
}
