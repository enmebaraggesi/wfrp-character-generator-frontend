package com.warhammer.wfrpfrontend.client;

import com.warhammer.wfrpfrontend.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.*;

@Service
@RequiredArgsConstructor
public class WarhammerClient {
    
    private final RestTemplate restTemplate;
    
    @Value("${warhammer.api.url}")
    private String url;
    
    public List<RaceDto> getRaces() {
        URI uri = UriComponentsBuilder.fromHttpUrl(url + "races")
                                      .build()
                                      .encode()
                                      .toUri();
        RaceDto[] raceDtos = restTemplate.getForObject(uri, RaceDto[].class);
        
        return Optional.ofNullable(raceDtos)
                       .map(Arrays::asList)
                       .orElse(Collections.emptyList());
    }
    
    public List<EyeColorDto> getEyeColors(String race) {
        String raceComponent = getRaceComponent(race);
        URI uri = UriComponentsBuilder.fromHttpUrl(url + "eyes/" + raceComponent)
                                      .build()
                                      .encode()
                                      .toUri();
        EyeColorDto[] eyeColorDtos = restTemplate.getForObject(uri, EyeColorDto[].class);
        
        return Optional.ofNullable(eyeColorDtos)
                       .map(Arrays::asList)
                       .orElse(Collections.emptyList());
    }
    
    public List<HairColorDto> getHairColors(String race) {
        String raceComponent = getRaceComponent(race);
        URI uri = UriComponentsBuilder.fromHttpUrl(url + "hair/" + raceComponent)
                                      .build()
                                      .encode()
                                      .toUri();
        HairColorDto[] hairColorDtos = restTemplate.getForObject(uri, HairColorDto[].class);
        
        return Optional.ofNullable(hairColorDtos)
                       .map(Arrays::asList)
                       .orElse(Collections.emptyList());
    }
    
    private static String getRaceComponent(String race) {
        switch (race) {
            case "Krasnolud" -> {
                return "dwarfs";
            }
            case "Niziołek" -> {
                return "halflings";
            }
            case "Wysoki elf" -> {
                return "helves";
            }
            case "Leśny elf" -> {
                return "welves";
            }
            default -> {
                return "humans";
            }
        }
    }
    
    public List<ProfessionDto> getProfessions() {
        URI uri = UriComponentsBuilder.fromHttpUrl(url + "professions")
                                      .build()
                                      .encode()
                                      .toUri();
        ProfessionDto[] professionDtos = restTemplate.getForObject(uri, ProfessionDto[].class);
        
        return Optional.ofNullable(professionDtos)
                       .map(Arrays::asList)
                       .orElse(Collections.emptyList());
    }
    
    public AgeDto getAge(String race) {
        String raceComponent = getRaceComponent(race);
        URI uri = UriComponentsBuilder.fromHttpUrl(url + "age/" + raceComponent)
                                      .build()
                                      .encode()
                                      .toUri();
        return restTemplate.getForObject(uri, AgeDto.class);
    }
    
    public HeightDto getHeight(String race) {
        String raceComponent = getRaceComponent(race);
        URI uri = UriComponentsBuilder.fromHttpUrl(url + "height/" + raceComponent)
                                      .build()
                                      .encode()
                                      .toUri();
        return restTemplate.getForObject(uri, HeightDto.class);
    }
    
    public List<SkillDto> getAdvancedSkills() {
        URI uri = UriComponentsBuilder.fromHttpUrl(url + "skills/advanced")
                                      .build()
                                      .encode()
                                      .toUri();
        SkillDto[] skillDtos = restTemplate.getForObject(uri, SkillDto[].class);
        return Optional.ofNullable(skillDtos)
                       .map(Arrays::asList)
                       .orElse(Collections.emptyList());
    }
}
