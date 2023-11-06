package com.warhammer.wfrpfrontend.service;

import com.warhammer.wfrpfrontend.client.WarhammerClient;
import com.warhammer.wfrpfrontend.dto.profession.ProfessionDto;
import com.warhammer.wfrpfrontend.mapper.PeofessionsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfessionsService {
    
    private final WarhammerClient client;
    private final PeofessionsMapper mapper;
    
    public List<String> getProfessionsNamesList() {
        List<ProfessionDto> professions = client.getProfessions();
        return mapper.mapProfessionDtoListToNamesList(professions);
    }
    
    public String getProfessionClassByProfessionName(String professionName) {
        List<ProfessionDto> professions = client.getProfessions();
        return mapper.mapProfessionDtoToClass(professions, professionName);
    }
    
    public String getStatusByProfessionName(String professionName) {
        List<ProfessionDto> professions = client.getProfessions();
        return mapper.mapProfessionDtoToStatus(professions, professionName);
    }
}
