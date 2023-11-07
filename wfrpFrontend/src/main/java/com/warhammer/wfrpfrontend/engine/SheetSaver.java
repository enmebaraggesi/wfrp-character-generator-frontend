package com.warhammer.wfrpfrontend.engine;

import com.warhammer.wfrpfrontend.creators.CharacteristicsLayoutCreator;
import com.warhammer.wfrpfrontend.creators.TablesLayoutCreator;
import com.warhammer.wfrpfrontend.dto.character.SheetCharacteristics;
import com.warhammer.wfrpfrontend.dto.character.SheetTables;
import com.warhammer.wfrpfrontend.model.CharacterSheet;
import com.warhammer.wfrpfrontend.service.CharacterSheetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SheetSaver {
    
    private final CharacterSheetService service;
    
    public void saveCharacterSheet(String characterName, CharacteristicsLayoutCreator characteristics,
                                   TablesLayoutCreator tables) {
        SheetCharacteristics sheetCharacteristics = characteristics.save();
        SheetTables sheetTables = tables.save();
        CharacterSheet characterSheet = new CharacterSheet(characterName, sheetCharacteristics, sheetTables);
        service.saveCharacterSheet(characterSheet);
    }
}
