package com.warhammer.wfrpfrontend.controller;

import com.warhammer.wfrpfrontend.client.WarhammerClient;
import com.warhammer.wfrpfrontend.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class AppearanceController {
    
    private final WarhammerClient client;
    
    public List<String> getRaces() {
        List<RaceDto> raceDtos = client.getRaces();
        return raceDtos.stream()
                       .map(RaceDto::race)
                       .sorted()
                       .toList();
    }
    
    public List<String> getEyeColors(String race) {
        List<EyeColorDto> eyeColors = client.getEyeColors(race);
        return eyeColors.stream()
                        .map(EyeColorDto::color)
                        .sorted()
                        .toList();
    }
    
    public List<String> getHairColors(String race) {
        List<HairColorDto> hairColors = client.getHairColors(race);
        return hairColors.stream()
                         .map(HairColorDto::color)
                         .sorted()
                         .toList();
    }
    
    public String getGeneratedAge(String race) {
        return client.getAge(race).age();
    }
    
    public String getGeneratedHeight(String race) {
        return client.getHeight(race).height();
    }
}
