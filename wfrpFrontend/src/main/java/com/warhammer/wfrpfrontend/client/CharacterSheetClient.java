package com.warhammer.wfrpfrontend.client;

import com.warhammer.wfrpfrontend.dto.character.SheetNamesDto;
import com.warhammer.wfrpfrontend.dto.character.CharacterReceivedDto;
import com.warhammer.wfrpfrontend.dto.character.CharacterSheetDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
@RequiredArgsConstructor
public class CharacterSheetClient {
    
    private final RestTemplate restTemplate;
    
    @Value("${warhammer.api.url}")
    private String url;
    
    public SheetNamesDto getAllCharacterSheetsNames() {
        URI uri = UriComponentsBuilder.fromHttpUrl(url + "characters")
                                      .build()
                                      .encode()
                                      .toUri();
        return restTemplate.getForObject(uri, SheetNamesDto.class);
    }
    
    public void saveCharacterSheet(CharacterSheetDto characterSheetDto) {
        URI uri = UriComponentsBuilder.fromHttpUrl(url + "characters")
                                      .build()
                                      .encode()
                                      .toUri();
        restTemplate.postForObject(uri, characterSheetDto, CharacterReceivedDto.class);
    }
    
    public void deleteCharacterSheetByName(String name) {
        URI uri = UriComponentsBuilder.fromHttpUrl(url + "characters" + name)
                                      .build()
                                      .encode()
                                      .toUri();
        restTemplate.delete(uri);
    }
}
