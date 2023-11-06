package com.warhammer.wfrpfrontend.service;

import com.warhammer.wfrpfrontend.client.WarhammerClient;
import com.warhammer.wfrpfrontend.dto.weapon.WeaponDto;
import com.warhammer.wfrpfrontend.mapper.WeaponsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WeaponsService {
    
    private final WarhammerClient client;
    private final WeaponsMapper mapper;
    
    public List<String> getWeaponsNameList() {
        List<WeaponDto> weapons = client.getWeapons();
        return mapper.mapWeaponDtoListToNameList(weapons);
    }
    
    public String getCategoryByName(String name) {
        List<WeaponDto> weapons = client.getWeapons();
        return mapper.mapWeaponDtoToCategory(weapons, name);
    }
    
    public String getWeightByName(String name) {
        List<WeaponDto> weapons = client.getWeapons();
        return mapper.mapWeaponDtoToWeight(weapons, name);
    }
    
    public String getRangeByName(String name) {
        List<WeaponDto> weapons = client.getWeapons();
        return mapper.mapWeaponDtoToRange(weapons, name);
    }
    
    public String getDamageByName(String name) {
        List<WeaponDto> weapons = client.getWeapons();
        return mapper.mapWeaponDtoToDamage(weapons, name);
    }
    
    public String getTraitsByName(String name) {
        List<WeaponDto> weapons = client.getWeapons();
        return mapper.mapWeaponDtoToTraits(weapons, name);
    }
}
