package com.warhammer.wfrpfrontend.controller;

import com.warhammer.wfrpfrontend.client.WarhammerClient;
import com.warhammer.wfrpfrontend.dto.ArmorDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class ArmorsController {
    
    private final WarhammerClient client;
    
    public List<String> getArmorsNames() {
        List<ArmorDto> armors = client.getArmors();
        return armors.stream()
                     .map(ArmorDto::name)
                     .toList();
    }
    
    public String getLocationByName(String name) {
        List<ArmorDto> armors = client.getArmors();
        return armors.stream()
                     .filter(dto -> dto.name().equals(name))
                     .map(ArmorDto::localization)
                     .collect(toSingleton());
    }
    
    public String getWeightByName(String name) {
        List<ArmorDto> armors = client.getArmors();
        return armors.stream()
                     .filter(dto -> dto.name().equals(name))
                     .map(ArmorDto::weight)
                     .collect(toSingleton());
    }
    
    public String getPenaltiesByName(String name) {
        List<ArmorDto> armors = client.getArmors();
        return armors.stream()
                     .filter(dto -> dto.name().equals(name))
                     .map(ArmorDto::penalty)
                     .collect(toSingleton());
    }
    
    public Integer getPointsByName(String name) {
        List<ArmorDto> armors = client.getArmors();
        return armors.stream()
                     .filter(dto -> dto.name().equals(name))
                     .map(ArmorDto::points)
                     .collect(toSingleton());
    }
    
    public String getTraitsByName(String name) {
        List<ArmorDto> armors = client.getArmors();
        return armors.stream()
                     .filter(dto -> dto.name().equals(name))
                     .map(ArmorDto::traits)
                     .collect(toSingleton());
    }
    
    private <T> Collector<T, ?, T> toSingleton() {
        return Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                    if (list.size() != 1) {
                        throw new IllegalStateException();
                    }
                    return list.get(0);
                }
        );
    }
}
