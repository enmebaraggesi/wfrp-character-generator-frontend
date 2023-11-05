package com.warhammer.wfrpfrontend.controller;

import com.warhammer.wfrpfrontend.client.WarhammerClient;
import com.warhammer.wfrpfrontend.dto.WeaponDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class WeaponsController {
    
    private final WarhammerClient client;
    
    public List<String> getWeaponsNames() {
        List<WeaponDto> weapons = client.getWeapons();
        return weapons.stream()
                      .map(WeaponDto::name)
                      .toList();
    }
    
    public String getCategoryByName(String name) {
        List<WeaponDto> weapons = client.getWeapons();
        return weapons.stream()
                      .filter(dto -> dto.name().equals(name))
                      .map(WeaponDto::type)
                      .collect(toSingleton());
    }
    
    public String getWeightByName(String name) {
        List<WeaponDto> weapons = client.getWeapons();
        return weapons.stream()
                      .filter(dto -> dto.name().equals(name))
                      .map(WeaponDto::weight)
                      .collect(toSingleton());
    }
    
    public String getRangeByName(String name) {
        List<WeaponDto> weapons = client.getWeapons();
        return weapons.stream()
                      .filter(dto -> dto.name().equals(name))
                      .map(WeaponDto::length)
                      .collect(toSingleton());
    }
    
    
    public String getDamageByName(String name) {
        List<WeaponDto> weapons = client.getWeapons();
        return weapons.stream()
                      .filter(dto -> dto.name().equals(name))
                      .map(WeaponDto::damage)
                      .collect(toSingleton());
    }
    
    public String getTraitsByName(String name) {
        List<WeaponDto> weapons = client.getWeapons();
        return weapons.stream()
                      .filter(dto -> dto.name().equals(name))
                      .map(WeaponDto::traits)
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
