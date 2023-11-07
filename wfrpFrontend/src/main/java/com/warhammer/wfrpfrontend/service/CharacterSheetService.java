package com.warhammer.wfrpfrontend.service;

import com.warhammer.wfrpfrontend.client.CharacterSheetClient;
import com.warhammer.wfrpfrontend.dto.character.SheetNamesDto;
import com.warhammer.wfrpfrontend.dto.character.CharacterSheetDto;
import com.warhammer.wfrpfrontend.mapper.CharacterSheetMapper;
import com.warhammer.wfrpfrontend.model.CharacterSheet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CharacterSheetService {
    
    private final CharacterSheetClient client;
    private final CharacterSheetMapper mapper;
    
    public List<String> getAllCharacterSheetNamesList() {
        SheetNamesDto characterSheetsNames = client.getAllCharacterSheetsNames();
        return mapper.mapCharacterSheetsNamesToNamesList(characterSheetsNames);
    }
    
    public void saveCharacterSheet(CharacterSheet characterSheet) {
        CharacterSheetDto characterSheetDto = mapper.mapCharacterSheetToCharacterSheetDto(characterSheet);
        client.saveCharacterSheet(characterSheetDto);
    }
    
    public void deleteCharacterSheetByName(String name) {
        client.deleteCharacterSheetByName(name);
    }
}
