package com.warhammer.wfrpfrontend.mapper;

import com.warhammer.wfrpfrontend.dto.armor.ArmorDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmorsMapper {
    
    public List<String> mapArmorDtoListToNameList(List<ArmorDto> armors) {
        return armors.stream()
                     .map(ArmorDto::name)
                     .toList();
    }
    
    public String mapArmorDtoListToLocation(List<ArmorDto> armors, String name) {
        return armors.stream()
                     .filter(dto -> dto.name().equals(name))
                     .map(ArmorDto::localization)
                     .findFirst().orElseThrow(IllegalStateException::new);
    }
    
    public String mapArmorDtoListToWeight(List<ArmorDto> armors, String name) {
        return armors.stream()
                     .filter(dto -> dto.name().equals(name))
                     .map(ArmorDto::weight)
                     .findFirst().orElseThrow(IllegalStateException::new);
    }
    
    public String mapArmorDtoListToPenalties(List<ArmorDto> armors, String name) {
        return armors.stream()
                     .filter(dto -> dto.name().equals(name))
                     .map(ArmorDto::penalty)
                     .findFirst().orElseThrow(IllegalStateException::new);
    }
    
    public Integer mapArmorDtoListToPoints(List<ArmorDto> armors, String name) {
        return armors.stream()
                     .filter(dto -> dto.name().equals(name))
                     .map(ArmorDto::points)
                     .findFirst().orElseThrow(IllegalStateException::new);
    }
    
    public String mapArmorDtoListToTraits(List<ArmorDto> armors, String name) {
        return armors.stream()
                     .filter(dto -> dto.name().equals(name))
                     .map(ArmorDto::traits)
                     .findFirst().orElseThrow(IllegalStateException::new);
    }
}
