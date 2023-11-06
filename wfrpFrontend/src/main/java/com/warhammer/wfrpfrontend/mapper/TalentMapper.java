package com.warhammer.wfrpfrontend.mapper;

import com.warhammer.wfrpfrontend.dto.talent.TalentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TalentMapper {
    
    public List<String> mapTalentDtoListToNameList(List<TalentDto> talents) {
        return talents.stream()
                      .map(TalentDto::name)
                      .toList();
    }
}
