package com.warhammer.wfrpfrontend.service;

import com.warhammer.wfrpfrontend.client.WarhammerClient;
import com.warhammer.wfrpfrontend.dto.armor.ArmorDto;
import com.warhammer.wfrpfrontend.mapper.ArmorsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArmorsService {
    
    private final WarhammerClient client;
    private final ArmorsMapper mapper;
    
    public List<String> getArmorsNamesList() {
        List<ArmorDto> armors = client.getArmors();
        return mapper.mapArmorDtoListToNameList(armors);
    }
    
    public String getArmorLocationByName(String name) {
        List<ArmorDto> armors = client.getArmors();
        return mapper.mapArmorDtoListToLocation(armors, name);
    }
    
    public String getArmorWeightByName(String name) {
        List<ArmorDto> armors = client.getArmors();
        return mapper.mapArmorDtoListToWeight(armors, name);
    }
    
    public String getArmorPenaltiesByName(String name) {
        List<ArmorDto> armors = client.getArmors();
        return mapper.mapArmorDtoListToPenalties(armors, name);
    }
    
    public Integer getArmorPointsByName(String name) {
        List<ArmorDto> armors = client.getArmors();
        return mapper.mapArmorDtoListToPoints(armors, name);
    }
    
    public String getArmorTraitsByName(String name) {
        List<ArmorDto> armors = client.getArmors();
        return mapper.mapArmorDtoListToTraits(armors, name);
    }
}
