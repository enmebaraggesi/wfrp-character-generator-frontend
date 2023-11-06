package com.warhammer.wfrpfrontend.mapper;

import com.warhammer.wfrpfrontend.dto.appearance.AgeDto;
import com.warhammer.wfrpfrontend.dto.appearance.HeightDto;
import com.warhammer.wfrpfrontend.dto.appearance.RaceDto;
import com.warhammer.wfrpfrontend.dto.appearance.EyeColorDto;
import com.warhammer.wfrpfrontend.dto.appearance.HairColorDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppearanceMapper {
    
    public List<String> mapRaceDtoListToRaceNamesList(List<RaceDto> raceDtos) {
        return raceDtos.stream()
                       .map(RaceDto::race)
                       .sorted()
                       .toList();
    }
    
    public List<String> mapEyeColorDtoListToColorList(List<EyeColorDto> eyeColors) {
        return eyeColors.stream()
                        .map(EyeColorDto::color)
                        .sorted()
                        .toList();
    }
    
    public List<String> mapHairColorDtoListToColorList(List<HairColorDto> hairColors) {
        return hairColors.stream()
                         .map(HairColorDto::color)
                         .sorted()
                         .toList();
    }
    
    public String mapAgeDtoToAge(AgeDto ageDto) {
        return ageDto.age();
    }
    
    public String mapHeightDtoToHeight(HeightDto heightDto) {
        return heightDto.height();
    }
}
