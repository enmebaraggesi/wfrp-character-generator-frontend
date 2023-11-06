package com.warhammer.wfrpfrontend.mapper;

import com.warhammer.wfrpfrontend.dto.name.*;
import org.springframework.stereotype.Service;

@Service
public class NamesMapper {
    
    public String mapNameDtoToName(NameDto nameDto) {
        return nameDto.getResults().stream()
                      .map(ResultDto::getName)
                      .map(name -> name.getFirst() + " " + name.getLast())
                      .findAny().orElseThrow(IllegalStateException::new);
    }
    
    public String mapNameDtoToFirstName(NameDto nameDto) {
        return nameDto.getResults().stream()
                      .map(ResultDto::getName)
                      .map(Name::getFirst)
                      .findAny().orElseThrow(IllegalStateException::new);
    }
}
