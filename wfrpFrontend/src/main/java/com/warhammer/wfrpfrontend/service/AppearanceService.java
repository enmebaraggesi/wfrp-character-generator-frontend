package com.warhammer.wfrpfrontend.service;

import com.warhammer.wfrpfrontend.client.WarhammerClient;
import com.warhammer.wfrpfrontend.dto.appearance.AgeDto;
import com.warhammer.wfrpfrontend.dto.appearance.HeightDto;
import com.warhammer.wfrpfrontend.dto.appearance.RaceDto;
import com.warhammer.wfrpfrontend.dto.appearance.EyeColorDto;
import com.warhammer.wfrpfrontend.dto.appearance.HairColorDto;
import com.warhammer.wfrpfrontend.mapper.AppearanceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppearanceService {
    
    private final WarhammerClient client;
    private final AppearanceMapper mapper;
    
    public List<String> getRacesNamesList() {
        List<RaceDto> raceDtos = client.getRaces();
        return mapper.mapRaceDtoListToRaceNamesList(raceDtos);
    }
    
    
    public List<String> getEyeColorsListByRace(String race) {
        List<EyeColorDto> eyeColors = client.getEyeColors(race);
        return mapper.mapEyeColorDtoListToColorList(eyeColors);
    }
    
    public List<String> getHairColorsListByRace(String race) {
        List<HairColorDto> hairColors = client.getHairColors(race);
        return mapper.mapHairColorDtoListToColorList(hairColors);
    }
    
    public String getGeneratedAgeByRace(String race) {
        AgeDto ageDto = client.getAge(race);
        return mapper.mapAgeDtoToAge(ageDto);
    }
    
    public String getGeneratedHeightByRace(String race) {
        HeightDto heightDto = client.getHeight(race);
        return mapper.mapHeightDtoToHeight(heightDto);
    }
}
