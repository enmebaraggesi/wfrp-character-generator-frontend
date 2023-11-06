package com.warhammer.wfrpfrontend.mapper;

import com.warhammer.wfrpfrontend.dto.inventory.HirelingDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HirelingsMapper {
    
    public List<String> mapHirelingDtoListToNameList(List<HirelingDto> hirelings) {
        return hirelings.stream()
                        .map(HirelingDto::name)
                        .toList();
    }
    
    public String mapHirelingDtoListToCost(List<HirelingDto> hirelings, String name) {
        return hirelings.stream()
                        .filter(dto -> dto.name().equals(name))
                        .map(dto -> "Sz: " + dto.quickJob() + ", D: " + dto.dayJob() + ", T: " + dto.weekJob())
                        .findFirst().orElseThrow(IllegalStateException::new);
    }
}
