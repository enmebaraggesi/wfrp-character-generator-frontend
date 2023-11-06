package com.warhammer.wfrpfrontend.service;

import com.warhammer.wfrpfrontend.client.NameGeneratorClient;
import com.warhammer.wfrpfrontend.dto.name.NameDto;
import com.warhammer.wfrpfrontend.mapper.NamesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NamesService {
    
    private final NameGeneratorClient client;
    private final NamesMapper mapper;
    
    
    public String getGeneratedName() {
        NameDto nameDto = client.getGeneratedIdentity();
        return mapper.mapNameDtoToName(nameDto);
    }
    
    public String getGeneratedFirstName() {
        NameDto nameDto = client.getGeneratedIdentity();
        return mapper.mapNameDtoToFirstName(nameDto);
    }
}
