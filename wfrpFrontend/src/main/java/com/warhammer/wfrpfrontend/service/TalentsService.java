package com.warhammer.wfrpfrontend.service;

import com.warhammer.wfrpfrontend.client.WarhammerClient;
import com.warhammer.wfrpfrontend.dto.talent.TalentDto;
import com.warhammer.wfrpfrontend.mapper.TalentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TalentsService {
    
    private final WarhammerClient client;
    private final TalentMapper mapper;
    
    
    public List<String> getTalentNameList() {
        List<TalentDto> talents = client.getTalents();
        return mapper.mapTalentDtoListToNameList(talents);
    }
}
