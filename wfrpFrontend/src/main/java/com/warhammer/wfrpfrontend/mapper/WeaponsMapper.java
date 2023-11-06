package com.warhammer.wfrpfrontend.mapper;

import com.warhammer.wfrpfrontend.dto.weapon.WeaponDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeaponsMapper {
    
    public List<String> mapWeaponDtoListToNameList(List<WeaponDto> weapons) {
        return weapons.stream()
                      .map(WeaponDto::name)
                      .toList();
    }
    
    public String mapWeaponDtoToCategory(List<WeaponDto> weapons, String name) {
        return weapons.stream()
                      .filter(dto -> dto.name().equals(name))
                      .map(WeaponDto::type)
                      .findAny().orElseThrow(IllegalStateException::new);
    }
    
    public String mapWeaponDtoToWeight(List<WeaponDto> weapons, String name) {
        return weapons.stream()
                      .filter(dto -> dto.name().equals(name))
                      .map(WeaponDto::weight)
                      .findAny().orElseThrow(IllegalStateException::new);
    }
    
    public String mapWeaponDtoToRange(List<WeaponDto> weapons, String name) {
        return weapons.stream()
                      .filter(dto -> dto.name().equals(name))
                      .map(WeaponDto::length)
                      .findAny().orElseThrow(IllegalStateException::new);
    }
    
    public String mapWeaponDtoToDamage(List<WeaponDto> weapons, String name) {
        return weapons.stream()
                      .filter(dto -> dto.name().equals(name))
                      .map(WeaponDto::damage)
                      .findAny().orElseThrow(IllegalStateException::new);
    }
    
    public String mapWeaponDtoToTraits(List<WeaponDto> weapons, String name) {
        return weapons.stream()
                      .filter(dto -> dto.name().equals(name))
                      .map(WeaponDto::traits)
                      .findAny().orElseThrow(IllegalStateException::new);
    }
}
